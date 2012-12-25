/* Example of a bumper beam being hit by a pendulum

This is an example file of a geometry input file for the 
Gmsh pre and postprocessor. The file defines a
bumper beam and a pendulum.

The geometry should be meshed with the mesh 2D button
when running Gmsh and then exported as a .msh file
(Version 1.0 file format).

This file can then be read into the Impact editor and
then saved as .in file. The file will then automatically
be translated into Fembic file format (Impacts native
file format).

The user then needs to edit the file to set the timestep
and other parameters as wanted.

The resulting edited file is included as bumper.in in the
examples catalog.
*/

// Import the definitions used in the physicals

Include "impact.geo";

// Set up parameters for the pendulum

size_pend = 30;
width = 203+102;
face = 203;
depth = 100;
arch = 100;

tx = -10;
ty = 300;
tz = 0;

// Set up parameters for the beam

size_beam = 20;
btx = 0;
bty = 0;
btz = 0;
fface = 60;
rface = 50;
bdepth = 60;
frac = 0.4;
cx = 4000;
angle = Pi/16;
barch = cx*angle;
                 
lmemb = 200;
size_memb = 20;





// Define the pendulum

Point(3) = {tx+0,ty+0,tz+0,size_pend};
Point(4) = {tx-4.80346,ty+0,tz+54.9038,size_pend};  
Point(7) = {tx-76,ty+0,tz+76.0244,size_pend};
Point(8) = {tx-76,ty+0,tz+400,2*size_pend};

Point(9) = {tx-4.80346,ty+0,tz-54.9038,size_pend};
Point(12) = {tx-76,ty+0,tz-76.0244,size_pend};
Point(13) = {tx-76,ty+0,tz-200,2*size_pend};

Line(1) = {3,4};
Line(2) = {4,7};
Line(3) = {7,8};

Line(4) = {9,3};
Line(5) = {12,9};
Line(6) = {13,12};

Point(103) = {tx-102,ty+width,tz+0,size_pend};
Point(104) = {tx-102,ty+width-4.80346,tz+54.9038,size_pend};
Point(107) = {tx-102,ty+width-76,tz+76.0244,size_pend};
Point(108) = {tx-102,ty+width-76,tz+400,2*size_pend};

Point(109) = {tx-102,ty+width-4.80346,tz-54.9038,size_pend};
Point(112) = {tx-102,ty+width-76,tz-76.0244,size_pend};
Point(113) = {tx-102,ty+width-76,tz-200,2*size_pend};

Line(101) = {103,104};
Line(102) = {104,107};
Line(103) = {107,108};

Line(104) = {109,103};
Line(105) = {112,109};
Line(106) = {113,112};


Point(203) = {tx-102,ty-width,tz+0,size_pend};
Point(204) = {tx-102,ty-width+4.80346,tz+54.9038,size_pend};
Point(207) = {tx-102,ty-width+76,tz+76.0244,size_pend};
Point(208) = {tx-102,ty-width+76,tz+400,2*size_pend};

Point(209) = {tx-102,ty-width+4.80346,tz-54.9038,size_pend};
Point(212) = {tx-102,ty-width+76,tz-76.0244,size_pend};
Point(213) = {tx-102,ty-width+76,tz-200,2*size_pend};

Line(201) = {203,204};
Line(202) = {204,207};
Line(203) = {207,208};

Line(204) = {209,203};
Line(205) = {212,209};
Line(206) = {213,212};

// Define the bumperbeam

Point(301) = {btx+0,bty+0,btz-fface,size_beam};
Point(302) = {btx+0,bty+0,btz+fface,size_beam};
Point(303) = {btx+bdepth,bty+0,btz+rface,size_beam};
Point(304) = {btx+bdepth,bty+0,btz-rface,size_beam};
Point(305) = {btx+0,bty+0,btz-frac*fface,size_beam};
Point(306) = {btx+0,bty+0,btz+frac*fface,size_beam};

Line(301) = {301,305};
Line(302) = {305,306};
Line(303) = {306,302};
Line(304) = {302,303};
Line(305) = {303,304};
Line(306) = {304,301};
Line(307) = {303,306};
Line(308) = {304,305};

// Now begin creating the model

For i In {1:6}

Extrude Line {i, {0,face,0}} {
  Layers {face/size_pend,i,1};
  Recombine;
};

Extrude Line {i, {0,-face,0}} {
  Layers {face/size_pend,6+i,1};
  Recombine;
};

EndFor



For i In {101:106}

Extrude Line {i, {0,0,1}, {-102+tx,203+ty,0+tz}, -Pi/2} {
  Layers {arch/size_pend,12+i-100,1};
  Recombine;
};

Extrude Line {i, {-depth,0,0}} {
  Layers {depth/size_pend,18+i-100,1};
  Recombine;
};

EndFor


For i In {201:206}

Extrude Line {i, {0,0,1}, {-102+tx,-203+ty,0+tz}, Pi/2} {
  Layers {arch/size_pend,24+i-200,1};
  Recombine;
};

Extrude Line {i, {-depth,0,0}} {
  Layers {depth/size_pend,30+i-200,1};
  Recombine;
};

EndFor


// Build beam

For i In {301:308}

Extrude Line {i, {0,0,1}, {cx+btx,bty,btz}, angle} {
  Layers { barch/size_beam, 54+i-300, 1};
  Recombine;
};

Extrude Line {i, {0,0,1}, {cx+btx,bty,btz}, -angle} {
  Layers {barch/size_beam,63+i-300,1};
  Recombine;
};

EndFor

// Ends left

Extrude Line {469, {0,0,1}, {cx+btx,bty,btz}, 0.1*angle} {
  Layers { 0.1*barch/size_beam, 64, 1};
  Recombine;
};

Extrude Line {477, {0,0,1}, {cx+btx,bty,btz}, 0.1*angle} {
  Layers { 0.1*barch/size_beam, 65, 1};
  Recombine;
};

Extrude Line {485, {0,0,1}, {cx+btx,bty,btz}, 0.1*angle} {
  Layers { 0.1*barch/size_beam, 66, 1};
  Recombine;
};

Extrude Line {493, {0,0,1}, {cx+btx,bty,btz}, 0.1*angle} {
  Layers { 0.1*barch/size_beam, 67, 1};
  Recombine;
};

Extrude Line {453, {0,0,1}, {cx+btx,bty,btz}, 0.1*angle} {
  Layers { 0.1*barch/size_beam, 68, 1};
  Recombine;
};

Extrude Line {461, {0,0,1}, {cx+btx,bty,btz}, 0.1*angle} {
  Layers { 0.1*barch/size_beam, 69, 1};
  Recombine;
};

Extrude Line {509, {0,0,1}, {cx+btx,bty,btz}, 0.1*angle} {
  Layers { 0.1*barch/size_beam, 70, 1};
  Recombine;
};

Extrude Line {501, {0,0,1}, {cx+btx,bty,btz}, 0.1*angle} {
  Layers { 0.1*barch/size_beam, 71, 1};
  Recombine;
};

// Ends right

Extrude Line {473, {0,0,1}, {cx+btx,bty,btz}, -0.1*angle} {
  Layers { 0.1*barch/size_beam, 72, 1};
  Recombine;
};

Extrude Line {481, {0,0,1}, {cx+btx,bty,btz}, -0.1*angle} {
  Layers { 0.1*barch/size_beam, 73, 1};
  Recombine;
};

Extrude Line {489, {0,0,1}, {cx+btx,bty,btz}, -0.1*angle} {
  Layers { 0.1*barch/size_beam, 74, 1};
  Recombine;
};

Extrude Line {497, {0,0,1}, {cx+btx,bty,btz}, -0.1*angle} {
  Layers { 0.1*barch/size_beam, 75, 1};
  Recombine;
};

Extrude Line {457, {0,0,1}, {cx+btx,bty,btz}, -0.1*angle} {
  Layers { 0.1*barch/size_beam, 76, 1};
  Recombine;
};

Extrude Line {465, {0,0,1}, {cx+btx,bty,btz}, -0.1*angle} {
  Layers { 0.1*barch/size_beam, 77, 1};
  Recombine;
};

Extrude Line {513, {0,0,1}, {cx+btx,bty,btz}, -0.1*angle} {
  Layers { 0.1*barch/size_beam, 78, 1};
  Recombine;
};

Extrude Line {505, {0,0,1}, {cx+btx,bty,btz}, -0.1*angle} {
  Layers { 0.1*barch/size_beam, 79, 1};
  Recombine;
};


// member left

Extrude Line {485, {lmemb,0,0}} {
  Layers { size_memb, 100, 1};
  Recombine;
};

Extrude Line {527, {lmemb,0,0}} {
  Layers { size_memb, 101, 1};
  Recombine;
};

Extrude Line {525, {lmemb,0,0}} {
  Layers { size_memb, 102, 1};
  Recombine;
};

Extrude Line {523, {lmemb,0,0}} {
  Layers { size_memb, 103, 1};
  Recombine;
};

// member right

Extrude Line {557, {lmemb,0,0}} {
  Layers { size_memb, 104, 1};
  Recombine;
};

Extrude Line {559, {lmemb,0,0}} {
  Layers { size_memb, 105, 1};
  Recombine;
};

Extrude Line {489, {lmemb,0,0}} {
  Layers { size_memb, 106, 1};
  Recombine;
};

Extrude Line {555, {lmemb,0,0}} {
  Layers { size_memb, 107, 1};
  Recombine;
};


// Pendulum
Physical Surface(eshell+cons1+mat1+010) = {1:36};

// Beam
Physical Surface(eshell+mat2+021) = {55:79};

// Members
Physical Surface(eshell+mat3+016) = {100:107};

// Rigid ends
// Note that the resulting rod_2 elements are to be deleted after
// the .msh file has been translated into .in format.
Physical Line(cons2+mat4+010) = {581,593,589,585,609,597,601,605};

// Mass loading
// Note: The boundary conditions are to be changed for these
// constraints into rigid_body and master nodes set accordingly.
// Dont forget to add the mass on node 7 and 507.
Physical Point(cons3) = {7};
Physical Point(cons4) = {507};

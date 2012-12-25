<?php
if (strtolower(substr($_SERVER['HTTP_ACCEPT_LANGUAGE'],0,2))  == "ru")
Header ("Location: index_ru.html");
else
if (strtolower(substr($_SERVER['HTTP_ACCEPT_LANGUAGE'],0,2))  == "ua")
Header ("Location: index_ua.html");
else
Header ("Location: index_us.html");
?>
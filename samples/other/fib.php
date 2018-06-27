<?php

function current_millis() {
    list($usec, $sec) = explode(" ", microtime());
    return round(((float)$usec + (float)$sec) * 1000);
}

function fib($n) {
	if ($n > 2) {
		return fib($n-1) + fib($n-2);
	}
	return 1;
}

$start = current_millis();
fib(30);
$timeDiff = current_millis() - $start;

echo "TIME: " . $timeDiff . "ms\n";
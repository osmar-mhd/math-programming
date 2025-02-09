<?php

function closure_addition($a, $b){
    return $a + $b;
}

function closure_multiplication($a, $b){
    return $a * $b;
}

echo "Closure Addition: " . closure_addition(3, 5) . "\n";
echo "Closure Multiplication: " . closure_multiplication(2, -3);
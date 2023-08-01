// SPDX-License-Identifier: MIT
pragma solidity ^0.8.15;

contract demo {
    uint number = 2;
    uint number2 = 3;

    function add() public view returns (uint) {
        return (number - number2);
    }
}

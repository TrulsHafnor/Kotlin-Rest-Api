package com.example.restapi.model

class Calculator {

    class Calculator (
        val first_number: Int,
        val second_number: Int,
        val operation: String
    )
    {
        fun getNumber(): Int? {
            if (operation == "ADD") {
                return add()
            }
            else if (operation == "SUBTRACT") {
                return subtract()
            }
            else if (operation == "MULTIPLY") {
                return multiply()
            }
            else if (operation == "DIVIDE") {
                return divide()
            }

            else {
                return null;
            }
        }


        private fun add(): Int {
            return first_number + second_number
        }

        private fun subtract(): Int {
            return first_number-second_number
        }

        private fun multiply(): Int {
            return first_number*second_number
        }

        private fun divide(): Int {
            return first_number/second_number
        }
    }
}
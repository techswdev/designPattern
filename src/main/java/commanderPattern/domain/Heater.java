                    package commanderPattern.domain;

                    public class Calculator {

                        public int calculate(String type, int operand1, int operand2){

                                if(type="plus"){
                                    return (operand1 + operand2);
                                }
                                if(type="minus"){
                                    return (operand1 - operand2);
                                }
                                if(type="devide"){
                                    return (operand1 / operand2);
                                }
                                if(type="multiple"){
                                    return (operand1 * operand2);
                                }
                        }
                    }

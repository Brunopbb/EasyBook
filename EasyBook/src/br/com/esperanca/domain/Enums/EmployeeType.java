package br.com.esperanca.domain.Enums;

public enum EmployeeType {

    SUPERVISOR{
        @Override
        public double calculateSalary(double salary){
            return (salary*0.30) + salary;
        }
    },
    LIBRARIAN{
        @Override
        public double calculateSalary(double salary){
            return (salary*0.10) + salary;
        }
    },
    MANAGER{
        @Override
        public double calculateSalary(double salary){
            return (salary*0.50) + salary;
        }
    };


    public abstract double calculateSalary(double salary);
}

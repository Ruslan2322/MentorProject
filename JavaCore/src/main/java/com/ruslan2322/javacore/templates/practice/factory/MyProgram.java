package com.company.practice.factory;

import java.util.Scanner;

/** Программа для оплаты госпошлины, механизм оплаты не реализовывал, т.к. задачи не стояло.
 * Программа опрашивает клиента о его соц статусе, что бы выдать ему сумму к оплате
 * Клиент вводит с клавиатуры #своего соц статуса  и подтверждает
 * Программа выдает сумму к оплате согласно выбора клиента
 * В случае неверного выбора клиенту предлогается повторить выбор(реализовано через цикл)
 * */

public class MyProgram {
    public static void main(String[] args) {

        CustomerFactory customerFactory = createCustomerBySocialStatus();
        Customer customer = customerFactory.createCustomer();
        customer.payDebt();

    }

    static CustomerFactory createCustomerBySocialStatus() {

        int status = 0;
        int count = 0;

        System.out.println(
                "Please choose your social status. Push number from 1 to 3 and Enter: \n1.Student.\n2.Worker.\n3.Pensioner.");

        while(count <= 1001) {
            Scanner sc = new Scanner(System.in);
            status = sc.nextInt();
            if (status >= 1 && status <= 3){
                count = 1001;
                break;
            }else {
                System.out.println("Wrong choice.Please Try again");
                continue;
            }
        }

            if (status == 1) {
                return new StudentFactory();
            } else if (status == 2) {
                return new WorkerFactory();
            } else if (status == 3) {
                return new PensionerFactory();
            } else {
                throw new RuntimeException(status + " is unknown");
            }
    }
}





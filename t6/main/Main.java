package com.company.t4.main;
//6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения его отдельных полей
// (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в
// значение 0.
// Создать методы изменения времени на заданное количество часов, минут и секунд.

import com.company.t4.view.Print;

public class Main {

    public static void main(String[] args) {
	Time time = new Time(0,0,0);
	time.setHours(22);
	time.setMinutes(45);
	time.setSeconds(30);

	Print.printTime(time);
    }
}

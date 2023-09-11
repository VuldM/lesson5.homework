package ru.geekbrains.lesson5;

import ru.geekbrains.lesson5.models.TableModel;
import ru.geekbrains.lesson5.presenters.BookingPresenter;
import ru.geekbrains.lesson5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter presenter = new BookingPresenter(model, bookingView);

        presenter.updateTablesUI();

        bookingView.reservationTable(new Date(), 5, "Станислав");

        bookingView.changeReservationTable(11, new Date(), 5, "Станислав");
    }

}

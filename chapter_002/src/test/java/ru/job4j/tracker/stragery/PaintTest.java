package ru.job4j.tracker.stragery;

import org.junit.Test;
import ru.job4j.stragery.Paint;
import ru.job4j.stragery.Square;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    @Test
    public void whenDrawSquare() {
        // получаем ссылку на стандартный вывод в консоль.
        PrintStream stdout = System.out;
        // Создаем буфер для хранения вывода.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //Заменяем стандартный вывод на вывод в пямять для тестирования.
        System.setOut(new PrintStream(out));
        // выполняем действия пишушиее в консоль.
        new Paint().draw(new Square());
        // проверяем результат вычисления
        assertThat(new String(out.toByteArray()), is(new StringBuilder().append("+++\n").append("+ +\n").append("+++").toString()));
        // возвращаем обратно стандартный вывод в консоль.
        System.setOut(stdout);
    }
}

// Задание 7
// Разработайте параметризованный модульный тест для проверки, что при вводе неверного
// идентификатора товара генерируется исключение RuntimeException.
// *Сделать тест параметризованным

// Ожидаемый результат: Исключение типа RuntimeException и сообщение
//  Не найден продукт с id 

// Параметризованный тест проверяет генерацию исключения RuntimeException при вводе неверного идентификатора товара.
// фреймворк для параметризованных тестов - JUnit 5 @ParameterizedTest. 
// Сохдаем набор входных данных (идентификаторов товаров) и ожидаемых результатов (ожидаемых исключений и сообщений).


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {

    @ParameterizedTest
    @CsvSource({
        "1, 'Product 1'",  // Верный идентификатор
        "2, 'Product 2'",  // Верный идентификатор
        "100, 'Не найден продукт с id 100'"  // Неверный идентификатор
    })
    public void testExceptionOnInvalidProductID(int productId, String expectedErrorMessage) {
        // Создаем объект корзины
        Cart cart = new Cart();

        // Создаем продукты
        Product product1 = new Product(1, "Product 1", 10.0, 5);
        Product product2 = new Product(2, "Product 2", 15.0, 3);

        // Добавляем продукты в магазин
        cart.addProductToCart(product1);
        cart.addProductToCart(product2);

        // Проверяем, что исключение RuntimeException генерируется
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            cart.removeProductByID(productId, 1);
        });

        // Проверяем, что сообщение исключения соответствует ожидаемому сообщению
        assertEquals(expectedErrorMessage, exception.getMessage());
    }
}

// Используем аннотацию @ParameterizedTest, которая позволяет передавать различные наборы входных данных для одного и того же теста. 
// В данном случае, мы передаем идентификаторы продуктов и ожидаемые сообщения об ошибках при удалении продуктов с неверными идентификаторами.

// Используем assertThrows для проверки, что вызов метода removeProductByID с неверным идентификатором генерирует исключение RuntimeException, 
// и сравниваем сообщение исключения с ожидаемым сообщением об ошибке.
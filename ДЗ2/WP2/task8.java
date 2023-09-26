// Задание №8
// Создайте модульный тест для проверки, что при попытке удалить из корзины больше
// товаров, чем там есть, генерируется исключение RuntimeException.

// Ожидаемый результат: Исключение типа RuntimeException и сообщение
// В корзине не найден продукт с id

// Модульный тест проверяет генерацию исключения RuntimeException при попытке удалить из корзины больше товаров, чем там есть.
// фреймворк - JUnit. 

// Создаем объект корзины, добавляем в нее некоторое количество продуктов, а затем пытаемся удалить больше товаров, чем есть в корзине. 
// Проверяем, что генерируется исключение с ожидаемым сообщением.


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {

    @Test
    public void testExceptionOnRemovingMoreProductsThanInCart() {
        // Создаем объект корзины
        Cart cart = new Cart();

        // Создаем продукт
        Product product = new Product(1, "Product 1", 10.0, 5); // 5 штук в корзине

        // Добавляем продукт в корзину
        cart.addProductToCart(product, 5); // Добавляем 5 штук

        // Проверяем, что исключение RuntimeException генерируется при попытке удалить больше товаров, чем есть в корзине
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            cart.removeProductByID(1, 6); // Попытка удалить 6 штук
        });

        // Проверяем, что сообщение исключения соответствует ожидаемому сообщению
        assertEquals("В корзине не найден продукт с id 1", exception.getMessage());
    }
}

// Создаем объект корзины и продукта, добавляем продукт в корзину, а затем пытаемся удалить больше товаров, чем есть в корзине. 
// Используем assertThrows для проверки, что генерируется исключение RuntimeException, и сравниваем сообщение исключения с ожидаемым сообщением об ошибке.
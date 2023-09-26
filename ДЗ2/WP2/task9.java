
// boolean Сломанный-Тест() {
 // // Assert (Проверка утверждения)
 //
//assertThat(cart.getTotalPrice()).isEqualTo(cart.getTotalPrice());
 // // Act (Выполнение)
 // cart.addProductToCartByID(2); // 250
 // cart.addProductToCartByID(2); // 250
 // // Arrange (Подготовка)
 // Shop shop = new Shop(getStoreItems());
 // Cart cart = new Cart(shop);
 // }

// Необходимо подготовить объекты для тестирования, выполнить действия (Act) и затем проверить утверждения (Assert)

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CartTest {

    private Shop shop;
    private Cart cart;

    @BeforeEach
    public void setUp() {
        // Arrange (Подготовка)
        shop = new Shop(getStoreItems());
        cart = new Cart(shop);
    }

    @Test
    public void testTotalPriceAfterAddingProducts() {
        // Act (Выполнение)
        cart.addProductToCartByID(2); // Добавление продукта с идентификатором 2
        cart.addProductToCartByID(2); // Добавление продукта с идентификатором 2

        // Assert (Проверка утверждения)
        double expectedTotalPrice = 250.0 * 2; // Ожидаемая общая стоимость
        assertThat(cart.getTotalPrice()).isEqualTo(expectedTotalPrice);
    }

    private StoreItem[] getStoreItems() {
        // Возвращаем массив продуктов для магазина
        // Здесь создаем и возвращаем массив объектов StoreItem
        // с разными идентификаторами и ценами, чтобы использовать их в магазине.
        // Пример:
        return new StoreItem[] {
            new StoreItem(1, "Product 1", 100.0),
            new StoreItem(2, "Product 2", 250.0),
            // Другие продукты
        };
    }
}

// В методе setUp выполняется подготовка объектов магазина и корзины перед выполнением каждого теста.
// фреймворк AssertJ используется для более удобного сравнения ожидаемых и фактических результатов.
// сначала выполняем действия (добавление продуктов в корзину) и затем проверяем утверждения (сравниваем общую стоимость корзины с ожидаемой стоимостью).

// метод getStoreItems можно изменить для возвращения желаемых продуктов в магазине
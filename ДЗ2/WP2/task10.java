// Задание №9
// Восстановите и оптимизируйте данный тестовый метод
// Введение в юнит-тестирование
// Задание №10
// Нужно оптимизировать тестовый метод, согласно следующим условиям:
// 1. Отображаемое имя - "Advanced test for calculating TotalPrice"
// 2. Тест должен повторяться 10 раз
// 3. Установлен таймаут на выполнение теста 70 Миллисекунд (unit = TimeUnit.MILLISECONDS)
// 4. После проверки работоспособности теста, его нужно выключить

// Для оптимизации тестового метода с учетом указанных условий используем JUnit. 

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(Lifecycle.PER_CLASS)
public class OptimizedCartTest {

    private Shop shop;
    private Cart cart;

    @BeforeEach
    public void setUp() {
        // Arrange (Подготовка) - Выполняется один раз перед всеми повторениями теста
        shop = new Shop(getStoreItems());
        cart = new Cart(shop);
    }

    @DisplayName("Advanced test for calculating TotalPrice")
    @RepeatedTest(value = 10, name = RepeatedTest.LONG_DISPLAY_NAME)
    @Timeout(value = 70, unit = TimeUnit.MILLISECONDS)
    public void testTotalPriceCalculation() {
        // Act (Выполнение)
        cart.addProductToCartByID(2); // Добавление продукта с идентификатором 2
        cart.addProductToCartByID(2); // Добавление продукта с идентификатором 2

        // Assert (Проверка утверждения)
        double expectedTotalPrice = 250.0 * 2; // Ожидаемая общая стоимость
        assertThat(cart.getTotalPrice()).isEqualTo(expectedTotalPrice);
    }

    private StoreItem[] getStoreItems() {
        // Возвращаем массив продуктов для магазина
        // Здесь вы можете создать и вернуть массив объектов StoreItem
        // с разными идентификаторами и ценами, чтобы использовать их в магазине.
        // Пример:
        return new StoreItem[] {
            new StoreItem(1, "Product 1", 100.0),
            new StoreItem(2, "Product 2", 250.0),
            // Другие продукты
        };
    }
}

// В оптимизированном тесте:

// используем аннотацию @RepeatedTest для выполнения теста 10 раз, и задаем отображаемое имя с помощью @DisplayName.
/ /Устанавливаем таймаут на выполнение теста в 70 миллисекунд с помощью @Timeout.
// Аннотация @BeforeEach выполняется перед каждым повторением теста, используем TestInstance(Lifecycle.PER_CLASS), чтобы она выполнялась один раз перед всеми повторениями.
// Метод setUp создает объекты магазина и корзины перед выполнением тестов.
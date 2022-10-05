package racing.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

    @DisplayName("앞으로 한칸 전지")
    @Test
    void 전진하는_경우_테스트() {
        Car car = new Car();
        car.move(() -> 1);

        assertThat(car.getDistance()).isEqualTo(1);
    }

    @DisplayName("제자리 걸음")
    @Test
    void 제자리에_있는_테스트() {
        Car car = new Car();
        car.move(() -> 0);

        assertThat(car.getDistance()).isEqualTo(0);
    }

}
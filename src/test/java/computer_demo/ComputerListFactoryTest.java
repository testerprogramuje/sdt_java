package computer_demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class ComputerListFactoryTest {

    @Test
    void shouldReturnListOfComputers() {
        List<Computer> computerList = ComputerListFactory.getComputerList();
        Assertions.assertThat(computerList.size()).isPositive();
    }

    @Test
    void shouldReturnListOfComputersWithStateFalse() {
        List<Computer> computerList = ComputerListFactory.getComputerList();
        for (Computer computer : computerList) {
            Assertions.assertThat(computer.isState()).isFalse();
        }
    }


}
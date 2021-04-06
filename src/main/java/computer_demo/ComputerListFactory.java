package computer_demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ComputerListFactory {

    public static List<Computer> getComputerList() {
        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer("Lenovo", ComputerType.HOME_PC, 256, 256, false));
        computers.add(new Computer("Lenovo", ComputerType.OFFICE_PC, 256, 256, false));
        computers.add(ComputerFactory.getPC(ComputerType.HOME_PC));
        computers.add(ComputerFactory.getPC(ComputerType.OFFICE_PC));

        return computers;
    }
}

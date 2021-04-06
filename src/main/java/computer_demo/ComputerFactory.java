package computer_demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ComputerFactory {

    public static Computer getPC(ComputerType computerType) {

        switch (computerType) {
            case HOME_PC:
                return new Computer("HP Home", ComputerType.HOME_PC, 512, 500, true);
            case OFFICE_PC:
                return new Computer("HP Office", ComputerType.OFFICE_PC, 128, 256, true);
            default:
                throw new IllegalArgumentException("Computer type not recognized");
        }
    }
}

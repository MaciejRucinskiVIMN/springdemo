package tech.paramount.springdemo.nameprovider;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@AllArgsConstructor
@Component
@Slf4j
@Profile("dev")
public class ScannerNameProvider implements NameProvider {

    private final Scanner scanner;
    @Override
    public String provideName() {
        log.debug("Enter name: ");
        return scanner.nextLine();
    }
}

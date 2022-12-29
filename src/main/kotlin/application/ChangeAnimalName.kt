package application

import org.springframework.stereotype.Service

@Service
class ChangeAnimalName {

    fun execute(animalCommand: AnimalCommand, expectedName: String): AnimalCommand {
        animalCommand.name = expectedName
        return animalCommand
    }
}
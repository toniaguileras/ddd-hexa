package application


import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock


class ChangeAnimalNameTest {

    @Test
    fun `change an existant animal its name`() {
        val legs = 4
        val age = 12
        val weight = 450.0
        val animalCommand = AnimalCommand("lion", legs, age, weight)
        val expectedName = "Elephant"
        val changeAnimalName = mock<ChangeAnimalName> {
            on { execute(animalCommand, expectedName) } doReturn AnimalCommand(expectedName, legs, age, weight)
        }
        val result = changeAnimalName.execute(animalCommand, expectedName)
        Assertions.assertEquals(result.name, expectedName)
    }
}
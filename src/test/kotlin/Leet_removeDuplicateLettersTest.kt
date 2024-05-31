import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@Nested
class Leet_removeDuplicateLettersTest {
    @Test
    @DisplayName("")
    fun test01() {
        assertThat(target.removeDuplicateLetters("bcabc")).isEqualTo("abc")
    }

    @Test
    @DisplayName("")
    fun test02() {
        assertThat(target.removeDuplicateLetters("cbacdcbc")).isEqualTo("acdb")
    }

//    @Test
//    fun test03() {
//        assertThat(target.removeDuplicateLetters()).isEqualTo()
//    }
//
//    @Test
//    @DisplayName("")
//    fun test04() {
//        assertThat(target.removeDuplicateLetters()).isEqualTo(0)
//    }

    companion object {
        private lateinit var target: Leet_removeDuplicateLetters

        @JvmStatic
        @BeforeAll
        fun setUp() {
            this.target = Leet_removeDuplicateLetters()
        }
    }
}

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@Nested
class Leet_longest_substring_witout_repeating_charactersTest {
    @Test
    @DisplayName("")
    fun test01() {
        assertThat(target.lengthOfLongestSubstring("abcabcbb"))
            .isEqualTo(3)
    }

    @Test
    @DisplayName("")
    fun test02() {
        assertThat(target.lengthOfLongestSubstring("bbbbb"))
            .isEqualTo(1)
    }

    @Test
    @DisplayName("")
    fun test03() {
        assertThat(target.lengthOfLongestSubstring("pwwkew"))
            .isEqualTo(3)
    }


    companion object {
        private lateinit var target: Leet_longest_substring_witout_repeating_characters

        @JvmStatic
        @BeforeAll
        fun setUp() {
            this.target = Leet_longest_substring_witout_repeating_characters()
        }
    }
}

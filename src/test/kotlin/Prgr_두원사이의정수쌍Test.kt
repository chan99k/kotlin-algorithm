import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@Nested
class Prgr_두원사이의정수쌍Test {
    @Test
    @DisplayName("")
    fun test01() {
        assertThat(target.solution(2, 3)).isEqualTo(20)
    }


    companion object {
        private lateinit var target: Prgr_두원사이의정수쌍

        @JvmStatic
        @BeforeAll
        fun setUp() {
            this.target = Prgr_두원사이의정수쌍()
        }
    }
}

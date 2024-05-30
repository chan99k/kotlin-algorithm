import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@Nested
class Prgr_롤케이크자르기Test {
    @Test
    @DisplayName("")
    fun test01() {
        assertThat(target.solution(intArrayOf(1, 2, 1, 3, 1, 4, 1, 2))).isEqualTo(2)
    }

    @Test
    @DisplayName("")
    fun test02() {
        assertThat(target.solution(intArrayOf(1, 2, 3, 1, 4))).isEqualTo(0)
    }


    companion object {
        private lateinit var target: Prgr_롤케이크자르기

        @JvmStatic
        @BeforeAll
        fun setUp() {
            this.target = Prgr_롤케이크자르기()
        }
    }
}

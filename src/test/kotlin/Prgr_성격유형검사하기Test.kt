import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@Nested
class Prgr_성격유형검사하기Test {
    @Test
    @DisplayName("")
    fun test01() {
        assertThat(target.solution(arrayOf("AN", "CF", "MJ", "RT", "NA"), intArrayOf(5, 3, 2, 7, 5))).isEqualTo("TCMA")
    }

    @Test
    @DisplayName("")
    fun test02() {
        assertThat(target.solution(arrayOf("TR", "RT", "TR"), intArrayOf(7, 1, 3))).isEqualTo("RCJA")
    }


    companion object {
        private lateinit var target: Prgr_성격유형검사하기

        @JvmStatic
        @BeforeAll
        fun setUp() {
            this.target = Prgr_성격유형검사하기()
        }
    }
}

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@Nested
class Prgr_메뉴리뉴얼Test {
    @Test
    @DisplayName("")
    fun test01() {
        assertThat(target.solution(arrayOf("ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"), intArrayOf(2, 3, 4)))
            .isEqualTo(arrayOf("AC", "ACDE", "BCFG", "CDE"))
    }

    @Test
    @DisplayName("")
    fun test02() {
        assertThat(target.solution(arrayOf("ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"), intArrayOf(2, 3, 5)))
            .isEqualTo(arrayOf("ACD", "AD", "ADE", "CD", "XYZ"))
    }

    @Test
    fun test03() {
        assertThat(target.solution(arrayOf("XYZ", "XWY", "WXA"), intArrayOf(2, 3, 4)))
            .isEqualTo(arrayOf("WX", "XY"))
    }


    companion object {
        private lateinit var target: Prgr_메뉴리뉴얼

        @JvmStatic
        @BeforeAll
        fun setUp() {
            this.target = Prgr_메뉴리뉴얼()
        }
    }
}

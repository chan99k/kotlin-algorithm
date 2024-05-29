import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@Nested
class Prgr_도넛과막대그래프Test {
    @Test
    @DisplayName("")
    fun test01() {
        assertThat(
            target.solution(
                arrayOf(intArrayOf(2, 3), intArrayOf(4, 3), intArrayOf(1, 1), intArrayOf(2, 1))
            )
        ).isEqualTo(intArrayOf(2, 1, 1, 0))
    }

    @Test
    @DisplayName("")
    fun test02() {
        assertThat(
            target.solution(
                arrayOf(
                    intArrayOf(4, 11), intArrayOf(1, 12), intArrayOf(8, 3),
                    intArrayOf(12, 7), intArrayOf(4, 2), intArrayOf(7, 11),
                    intArrayOf(4, 8), intArrayOf(9, 6), intArrayOf(10, 11),
                    intArrayOf(6, 10), intArrayOf(3, 5), intArrayOf(11, 1),
                    intArrayOf(5, 3), intArrayOf(11, 9), intArrayOf(3, 8)
                )
            )
        ).isEqualTo(intArrayOf(4, 0, 1, 2))
    }


    companion object {
        private lateinit var target: Prgr_도넛과막대그래프

        @JvmStatic
        @BeforeAll
        fun setUp() {
            this.target = Prgr_도넛과막대그래프()
        }
    }
}

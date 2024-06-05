import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@Nested
class Prgr_네트워크Test {
    @Test
    @DisplayName("")
    fun test01() {
        assertThat(
            target.solution(
                3,
                arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 1, 0), intArrayOf(0, 0, 1))
            )
        ).isEqualTo(2)
    }

    @Test
    @DisplayName("")
    fun test02() {
        assertThat(
            target.solution(
                3,
                arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 1, 1), intArrayOf(0, 1, 1))
            )
        ).isEqualTo(1)
    }

    @Test
    @DisplayName("")
    fun test03() {
        assertThat(
            target.solution(
                4, arrayOf(
                    intArrayOf(1, 0, 0, 0), intArrayOf(0, 1, 0, 0), intArrayOf(0, 0, 1, 0),
                    intArrayOf(0, 0, 0, 1)
                )
            )
        ).isEqualTo(4)
    }

    @Test
    @DisplayName("")
    fun test04() {
        assertThat(
            target.solution(
                5, arrayOf(
                    intArrayOf(1, 1, 0, 1, 0),
                    intArrayOf(1, 1, 0, 0, 0),
                    intArrayOf(0, 0, 1, 0, 1),
                    intArrayOf(1, 0, 0, 1, 1),
                    intArrayOf(0, 0, 1, 1, 1)
                )
            )
        ).isEqualTo(1)
    }

    @Test
    @DisplayName("")
    fun test05() {
        assertThat(
            target.solution(
                5, arrayOf(
                    intArrayOf(1, 0, 0, 0, 1), intArrayOf(0, 1, 1, 0, 0), intArrayOf(0, 1, 1, 1, 0),
                    intArrayOf(0, 0, 1, 1, 1), intArrayOf(1, 0, 0, 1, 1)
                )
            )
        ).isEqualTo(1)
    }


    companion object {
        private lateinit var target: Prgr_네트워크

        @JvmStatic
        @BeforeAll
        fun setUp() {
            this.target = Prgr_네트워크()
        }
    }
}

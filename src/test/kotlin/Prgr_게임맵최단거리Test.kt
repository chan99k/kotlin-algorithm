import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@Nested
class Prgr_게임맵최단거리Test {
    @Test
    @DisplayName("")
    fun test01() {
        assertThat(
            target.solution(
                arrayOf(
                    intArrayOf(1, 0, 1, 1, 1),
                    intArrayOf(1, 0, 1, 0, 1),
                    intArrayOf(1, 0, 1, 1, 1),
                    intArrayOf(1, 1, 1, 0, 1),
                    intArrayOf(0, 0, 0, 0, 1)
                )
            )
        ).isEqualTo(11)
    }

    @Test
    @DisplayName("")
    fun test02() {
        assertThat(
            target.solution(
                arrayOf(
                    intArrayOf(1, 0, 1, 1, 1),
                    intArrayOf(1, 0, 1, 0, 1),
                    intArrayOf(1, 0, 1, 1, 1),
                    intArrayOf(1, 1, 1, 0, 0),
                    intArrayOf(0, 0, 0, 0, 1)
                )
            )
        ).isEqualTo(-1)
    }


    companion object {
        private lateinit var target: Prgr_게임맵최단거리

        @JvmStatic
        @BeforeAll
        fun setUp() {
            this.target = Prgr_게임맵최단거리()
        }
    }
}

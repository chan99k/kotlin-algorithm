import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@Nested
class Leet_NqueensTest {
    @Test
    @DisplayName("")
    fun test01() {
        assertThat(target.solveNQueens(1)).isEqualTo(mutableListOf(mutableListOf("Q")))
    }

    @Test
    @DisplayName("")
    fun test02() {
        assertThat(target.solveNQueens(2)).isEqualTo(
            mutableListOf<MutableList<String>>()
        )
    }

    @Test
    @DisplayName("")
    fun test03() {
        assertThat(target.solveNQueens(4)).isEqualTo(
            mutableListOf(
                mutableListOf("..Q.", "Q...", "...Q", ".Q.."),
                mutableListOf(".Q..", "...Q", "Q...", "..Q."),
                )
        )
    }


    companion object {
        private lateinit var target: Leet_Nqueens

        @JvmStatic
        @BeforeAll
        fun setUp() {
            this.target = Leet_Nqueens()
        }
    }
}

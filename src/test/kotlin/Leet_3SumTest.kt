import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@Nested
class Leet_3SumTest {
    @Test
    @DisplayName("")
    fun test01() {
        assertThat(target.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))).isEqualTo(
            mutableListOf<List<Int>>(
                mutableListOf(-1, -1, 2),
                mutableListOf(-1, 0, 1)
            )
        )
    }

    @Test
    @DisplayName("")
    fun test02() {
        assertThat(target.threeSum(intArrayOf(0, 1, 1)))
            .isEqualTo(mutableListOf<List<Int>>())
    }

    @Test
    fun test03() {
        assertThat(target.threeSum(intArrayOf(0, 0, 0))).isEqualTo(mutableListOf<List<Int>>(mutableListOf(0,0,0)))
    }

//    @Test
//    @DisplayName("")
//    fun test04() {
//        assertThat(target.threeSum()).isEqualTo(0)
//    }

    companion object {
        private lateinit var target: Leet_3Sum

        @JvmStatic
        @BeforeAll
        fun setUp() {
            this.target = Leet_3Sum()
        }
    }
}

import org.junit.jupiter.api.Assertions.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@Nested
class `Leet_Merge IntervalsTest` {
    @Test
    @DisplayName("")
    fun test01() {
        assertThat(target.merge(arrayOf(intArrayOf(1,3), intArrayOf(2,6), intArrayOf(8,10), intArrayOf(15,18))))
            .isEqualTo(arrayOf(intArrayOf(1,6), intArrayOf(8,10), intArrayOf(15,18)))
    }
    @Test
    @DisplayName("")
    fun test02() {
        assertThat(target.merge(arrayOf(intArrayOf(1, 4), intArrayOf(4, 5))))
            .isEqualTo(arrayOf(intArrayOf(1, 5)))
    }

    companion object {
        private lateinit var target: `Leet_Merge Intervals`

        @JvmStatic
        @BeforeAll
        fun setUp() {
            this.target = `Leet_Merge Intervals`()
        }
    }
}

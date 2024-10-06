import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@Nested
class `Leet_Remove Duplicates from Sorted ArrayTest` {
    @Test
    @DisplayName("")
    fun test01() {
        val arr = intArrayOf(1, 1, 2)
        assertThat(target.removeDuplicates(arr)).isEqualTo(2)
        assertThat(arr).startsWith(1, 2)

    }


    companion object {
        private lateinit var target: `Leet_Remove Duplicates from Sorted Array`

        @JvmStatic
        @BeforeAll
        fun setUp() {
            this.target = `Leet_Remove Duplicates from Sorted Array`()
        }
    }
}

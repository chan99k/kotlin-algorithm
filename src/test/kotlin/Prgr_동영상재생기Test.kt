import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@Nested
class Prgr_동영상재생기Test {
    @Test
    @DisplayName("")
    fun test01() {
        assertThat(target.solution("34:33", "13:00", "00:55", "02:55", arrayOf("next", "prev")))
            .isEqualTo("13:00")
    }

    @Test
    @DisplayName("")
    fun test02() {
        assertThat(
            target.solution(
                "10:55",
                "00:05",
                "00:15",
                "06:55",
                arrayOf("prev", "next", "next")
            )
        ).isEqualTo("06:55")
    }

    @Test
    fun test03() {
        assertThat(target.solution("07:22", "04:05", "00:15", "04:07", arrayOf("next"))).isEqualTo("04:17")
    }


    companion object {
        private lateinit var target: Prgr_동영상재생기

        @JvmStatic
        @BeforeAll
        fun setUp() {
            this.target = Prgr_동영상재생기()
        }
    }
}

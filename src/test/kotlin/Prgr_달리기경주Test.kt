import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@Nested
class Prgr_달리기경주Test {
    @Test
    @DisplayName("")
    fun test01() {
        assertThat(
            target.solution(
                arrayOf("mumu", "soe", "poe", "kai", "mine"),
                arrayOf("kai", "kai", "mine", "mine")
            )
        )
            .isEqualTo(arrayOf("mumu", "kai", "mine", "soe", "poe"))
    }


    companion object {
        private lateinit var target: Prgr_달리기경주

        @JvmStatic
        @BeforeAll
        fun setUp() {
            this.target = Prgr_달리기경주()
        }
    }
}

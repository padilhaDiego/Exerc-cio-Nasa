import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Teste {
    Nasa nasa;

    @BeforeEach
    void getInit () {
        this.nasa = new Nasa();
    }

    @Test
    void posicaoInicial(){
        assertEquals("(0,0,N)", nasa.getPosicao());
    }

    @Test
    void movimentoEsquerda(){
        assertEquals("(0,2,W)", nasa.getPosicaoAtual("MML"));
    }
    @Test
    void movimentoDireita(){
        assertEquals("(2,0,S)", nasa.getPosicaoAtual("MMRMMRMM"));
    }
}

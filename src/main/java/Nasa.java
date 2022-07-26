public class Nasa {
    private int x = 0;
    private int y = 0;
    private String coordenadaIncial = "N";

    public String getPosicao() {
        String resposta = "(" + x + "," + y + "," + coordenadaIncial + ")";
        return resposta;
    }

    public String getPosicaoAtual(String comandos) {

        for (String comando : comandos.split("")) {

            if ("M".equals(comando)) {

                if ("N".equals(coordenadaIncial)) {
                    y += 1;
                } else if ("S".equals(coordenadaIncial)) {
                    y -= 1;
                } else if ("W".equals(coordenadaIncial)) {
                    x -= 1;
                } else if ("E".equals(coordenadaIncial)) {
                    x += 1;
                }

            } else if ("L".equals(comando)) {
                if ("N".equals(coordenadaIncial)){
                    coordenadaIncial = "W";
                } else if ("W".equals(coordenadaIncial)){
                    coordenadaIncial = "S";
                } else if ("S".equals(coordenadaIncial)) {
                    coordenadaIncial = "E";
                } else if ("E".equals(coordenadaIncial)) {
                    coordenadaIncial = "N";
                }

            } else if ("R".equals(comando)) {
                if ("N".equals(coordenadaIncial)){
                    coordenadaIncial = "E";
                } else if ("E".equals(coordenadaIncial)) {
                    coordenadaIncial = "S";
                } else if ("S".equals(coordenadaIncial)) {
                    coordenadaIncial = "W";
                } else if ("W".equals(coordenadaIncial)) {
                    coordenadaIncial = "N";
                }

            }

        }
        return getPosicao();
    }
}

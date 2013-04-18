/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprojeto.lacunas;

/**
 *
 * @author aluno
 */
public class Gerador {
    
     private static String[] frases = {
        "Raspatic donovis tendendoi uriatam, balaburte samuabo. ",
        "Xisvipique taque lene lodovocum perculare, troivante tate. ",
        "Doscopurum virtuane, xapacante vequetrigue, uluarau barbante. ",
        "Rostro povich, violante, cello dulce, dulce cello, cai ramevo. ",
        "Vontonoi caractamparam duno treno taktananakar zem tem.",
        "Divorgenes tom divogenes, caramacaras tantaram zulu data.",
        "Cormicoides som velotes, tunukuram adjanas boroloreim.",
        "Dorbi ante, mula prakti, olerante sandalos olentes, gor dal. ",
        "Zizibue ratanique olereu devagar zeu, mar tinho davi la.",
        "Ulti dor lacio, bilacquidas par nas nismok do spok. ",
        "Trenk trankou. " ,
        "Du di vindas. ",
        "Entonio vader, sky muolqui, chorche lutas isperdeu. ",
        "More nomore, diave rum, dia tia tuntamon, arriribes divison. "
    };
    
    public static String proxFrase() {
        DadoDaSorte f = new DadoDaSorte(frases.length);
        return frases[f.lancar()];
    }
    
    /**
     * @return numero aleatorio de frases.
     */
    public static String proxParagrafo () {
        DadoDaSorte f = new DadoDaSorte(frases.length);
        DadoDaSorte q = new DadoDaSorte(3);
        int i = 3 + q.lancar();
        int[] fr = f.lancarVariasVezesSemRepetir(i);
        String res = "";
        for (int j = 0; j < fr.length; j++) {
            res = res + frases[fr[j]];
            res = res + " ";
        }
        return res.substring(0, res.length() - 1);
    }
    
    public static String proxDoisParagrafos () {
        return proxParagrafo() + "\n" + proxParagrafo();
    }

    public static String proxTresParagrafos () {
        return proxDoisParagrafos() + "\n" + proxParagrafo();
    }
    
    
}

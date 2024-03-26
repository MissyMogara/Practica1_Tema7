package Expediente_Alumnos;
public class Test {
    public static void main(String[] args) {
        //Students
        Estudiante miqota = new Estudiante("23095818M","Miqota","PurrPurr",null,
                "Calle Miqota","lagata@gmail.com","Eorzea",123876495L);
        Estudiante aura = new Estudiante("13245518A","Aura","Noxra",null,
                "Calle Miqota","lagarta@gmail.com","Eorzea",921886295L);
        Estudiante elysia = new Estudiante("62885811E","Elysia","Everlasting",null,
                "Elysium","pinkelf@gmail.com","Elysium",973816255L);
        //Grades
        NotasCurso nota1 = new NotasCurso(EtapaEducativa.FP_SUPERIOR,"DAW",Curso.PRIMERO,null);
        nota1.addNota("Programacion",8.5);
        nota1.addNota("BBDD",9.3);
        nota1.addNota("SistemasInformaticos",7.0);
        /* -------------- */
        NotasCurso nota2 = new NotasCurso(EtapaEducativa.FP_SUPERIOR,"DAW",Curso.PRIMERO,null);
        nota2.addNota("Programacion",7.5);
        nota2.addNota("BBDD",9.0);
        nota2.addNota("SistemasInformaticos",8.0);
        /* -------------- */
        NotasCurso nota3 = new NotasCurso(EtapaEducativa.FP_SUPERIOR,"DAW",Curso.SEGUNDO,null);
        nota3.addNota("Programacion",9.5);
        nota3.addNota("BBDD",7.0);
        nota3.addNota("SistemasInformaticos",8.7);
        //Proceedings
        Expediente exp1 = new Expediente(miqota,true);
        exp1.addNotas(nota1);
        /* -------------- */
        Expediente exp2 = new Expediente(aura,true);
        exp2.addNotas(nota2);
        /* -------------- */
        Expediente exp3 = new Expediente(elysia,true);
        exp3.addNotas(nota3);
        //School
        CentroEducativo centroEducativo = new CentroEducativo("Midwich","Silent Hills",
                "Localidad",982573015L,"pyramid@gmail.com");
        centroEducativo.addExpediente(exp1);
        centroEducativo.addExpediente(exp2);
        centroEducativo.addExpediente(exp3);
        //TEST
        System.out.println(centroEducativo.buscarExpediente("13245518A"));
    }
}

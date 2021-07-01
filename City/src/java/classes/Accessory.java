package classes;


public class Accessory {
    
    public static double Area(long a, double b){
        return (a / b);
    }
    
    public static double Ciclovias(double v){
        return (v * 39) / 100;
    }
    
    public static byte ClubesDeBasquete(long G){
        return (byte) (G / 1210000);
    }
    
    public static byte ClubesDeFutebol(long H){
        return (byte) (H / 775000);
    }
    
    public static short Distritos(double I){
        return (short) ((I * 100) / 1584);
    }
    
    public static short EnsinoFundamental(long e){
        
        double Porcentagem;
        
        Porcentagem = (e * 1775) / 10000;
        
        return (short) (((Porcentagem / 411) * 44) / 100);
    }
    
    public static short EnsinoInfantil(long g){
        
        double P;
        
        P = (g * 1775) / 10000;
        
        return (short) (((P / 411) * 35) / 100);
    }
    
    public static short EnsinoMedio(long f){
        
        double Porc;
        
        Porc = (f * 1775) / 10000;
        
        return (short) (((Porc / 411) * 21) / 100);
    }
    
    public static short EstacoesDoMetro(double z){
        return (short) ((z * 100) / 79);
    }
    
    public static short EstacoesDoVLT(double A){
        return (short) ((A * 1000) / 792);
    }
    
    public static double Estradas(double y){
        return (y * 25) / 10;
    }
    
    public static int EstudantesNasPrivadas(int i){
        return ((i * 25) / 100);
    }
    
    public static int EstudantesNasPublicas(int j){
        return (j * 75) / 100;
    }
    
    public static short FrotaDeBondes(long K){
        return (short) (K / 8775);
    }
    
    public static short Galerias(short F){
        return (short) ((F * 28) / 10);
    }
    
    public static short HospitaisFilantropicos(short r){
        return (short) ((r * 6) / 100);
    }
    
    public static short HospitaisPrivados(short p){
        return (short) ((p * 54) / 100);
    }
    
    public static short HospitaisPublicos(short q){
        return (short) ((q * 4) / 10);
    }
    
    public static short HopitaisTotais(long o){
        return (short) (o / 55660);
    }
    
    public static short LinhasDoMetro(double B){
        return (short) ((B * 100) / 2555);
    }
    
    public static short LinhasDoVLT(double C){
        return (short) ((C * 10) / 126);
    }
    
    public static short MicroOnibus(short O){
        return (short) ((O * 2) / 100);
    }
    
    public static double Metropolitano(double w){
        return (w * 27) / 100;
    }
    
    public static short Museus(long E){
        return (short) (E / 88968);
    }
    
    public static short Onibus(long L){
        return (short) (L / 776);
    }
    
    public static short OnibusComuns(short M){
        return (short) ((M * 65) / 100);
    }
    
    public static double PIB(long c, double d){
        return (c * d) / 1000;
    }
    
    public static int PopDeEstudantes(long h){
        return (int) ((h * 472) / 10000);
    }
    
    public static byte Subprefeituras(short J){
        return (byte) (J / 3);
    }
    
    public static short TotalDeUniversidades(short m, short n){
        return (short) (m + n);
    }
    
    public static short Trolebus(short N){
        return (short) ((N * 33) / 100);
    }
    
    public static short UniversidadesPrivadas(int l){
        return (short) (l / 14196);
    }
    
    public static short UniversidadesPublicas(int k){
        return (short) (k / 32512);
    }
    
    public static short UBSprivadas(short t){
        return (short) ((t * 55) / 100);
    }
    
    public static short UBSpublicas(short u){
        return (short) ((u * 45) / 100);
    }
    
    public static short UBStotais(long s){
        return (short) (s / 4512);
    }
    
    public static double ViasUrbanas(double D){
        return (D * 221) / 1000;
    }
    
    public static double VLT(double x){
        return (x * 5) / 100;
    }
}

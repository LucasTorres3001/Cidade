package classes;

import java.text.DecimalFormat;
import java.util.Calendar;


public class Info {
    
    DecimalFormat f = new DecimalFormat();
    
    private String Clima,Gini,IDH,Mes;
    private long Populacao;
    private double Area,Ciclovias,Densidade,Estradas,ExtensaoDoMetropolitano,ExtensaoDoVLT,PIBperCapita,PIB,ViasUrbanas;
    private int EstudantesNasUnivPrivadas,EstudantesNasUnivPublicas,PopDeEstudantes;
    private short Altitude,Distritos,EnsinoInfantil,HospitaisPrivados,HospitaisPublicos,HospitaisTotais,UBSprivadas,UBSpublicas,UBStotais;
    private short Academias,Ano,EnsinoFundamental,EnsinoMedio,Galerias,Museus,UniversidadesPrivadas,UniversidadesPublicas,UniversidadesTotais;
    private short EstacoesDoMetro,EstacoesDoVLT,HospitaisFilantropicos,LinhasDoMetro,LinhasDoVLT,Onibus;
    private short FrotaDeBondes,MicroOnibus,OnibusComuns,Trolebus;
    private byte Aeroportos,ClubesDeBasquete,ClubesDeFutebol,Dia,Estadios,Heliportos,Subprefeituras;
    public short Ano_atual = (short) Calendar.getInstance().get(Calendar.YEAR);

    public short getOnibus() {
        return Onibus;
    }

    public void setOnibus(short Onibus) {
        this.Onibus = Onibus;
    }

    public short getFrotaDeBondes() {
        return FrotaDeBondes;
    }

    public void setFrotaDeBondes(short FrotaDeBondes) {
        this.FrotaDeBondes = FrotaDeBondes;
    }

    public short getMicroOnibus() {
        return MicroOnibus;
    }

    public void setMicroOnibus(short MicroOnibus) {
        this.MicroOnibus = MicroOnibus;
    }

    public short getOnibusComuns() {
        return OnibusComuns;
    }

    public void setOnibusComuns(short OnibusComuns) {
        this.OnibusComuns = OnibusComuns;
    }

    public short getTrolebus() {
        return Trolebus;
    }

    public void setTrolebus(short Trolebus) {
        this.Trolebus = Trolebus;
    }
    
    public short getEstacoesDoMetro() {
        return EstacoesDoMetro;
    }

    public void setEstacoesDoMetro(short EstacoesDoMetro) {
        this.EstacoesDoMetro = EstacoesDoMetro;
    }

    public short getEstacoesDoVLT() {
        return EstacoesDoVLT;
    }

    public void setEstacoesDoVLT(short EstacoesDoVLT) {
        this.EstacoesDoVLT = EstacoesDoVLT;
    }

    public short getLinhasDoMetro() {
        return LinhasDoMetro;
    }

    public void setLinhasDoMetro(short LinhasDoMetro) {
        this.LinhasDoMetro = LinhasDoMetro;
    }

    public short getLinhasDoVLT() {
        return LinhasDoVLT;
    }

    public void setLinhasDoVLT(short LinhasDoVLT) {
        this.LinhasDoVLT = LinhasDoVLT;
    }

    public short getHospitaisFilantropicos() {
        return HospitaisFilantropicos;
    }

    public void setHospitaisFilantropicos(short HospitaisFilantropicos) {
        this.HospitaisFilantropicos = HospitaisFilantropicos;
    }

    public String getClima() {
        return Clima;
    }

    public void setClima(String Clima) {
        this.Clima = Clima;
    }

    public short getAltitude() {
        return Altitude;
    }

    public void setAltitude(short Altitude) {
        this.Altitude = Altitude;
    }

    public String getGini() {
        return Gini;
    }

    public void setGini(String Gini) {
        this.Gini = Gini;
    }

    public String getIDH() {
        return IDH;
    }

    public void setIDH(String IDH) {
        this.IDH = IDH;
    }

    public double getDensidade() {
        return Densidade;
    }

    public void setDensidade(double Densidade) {
        this.Densidade = Densidade;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public short getAno() {
        return Ano;
    }

    public void setAno(short Ano) {
        this.Ano = Ano;
    }

    public byte getDia() {
        return Dia;
    }

    public void setDia(byte Dia) {
        this.Dia = Dia;
    }

    public long getPopulacao() {
        return Populacao;
    }

    public void setPopulacao(long Populacao) {
        this.Populacao = Populacao;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public double getCiclovias() {
        return Ciclovias;
    }

    public void setCiclovias(double Ciclovias) {
        this.Ciclovias = Ciclovias;
    }

    public double getEstradas() {
        return Estradas;
    }

    public void setEstradas(double Estradas) {
        this.Estradas = Estradas;
    }

    public double getExtensaoDoMetropolitano() {
        return ExtensaoDoMetropolitano;
    }

    public void setExtensaoDoMetropolitano(double ExtensaoDoMetropolitano) {
        this.ExtensaoDoMetropolitano = ExtensaoDoMetropolitano;
    }

    public double getExtensaoDoVLT() {
        return ExtensaoDoVLT;
    }

    public void setExtensaoDoVLT(double ExtensaoDoVLT) {
        this.ExtensaoDoVLT = ExtensaoDoVLT;
    }

    public double getPIBperCapita() {
        return PIBperCapita;
    }

    public void setPIBperCapita(double PIBperCapita) {
        this.PIBperCapita = PIBperCapita;
    }

    public double getPIB() {
        return PIB;
    }

    public void setPIB(double PIB) {
        this.PIB = PIB;
    }

    public double getViasUrbanas() {
        return ViasUrbanas;
    }

    public void setViasUrbanas(double ViasUrbanas) {
        this.ViasUrbanas = ViasUrbanas;
    }

    public int getEstudantesNasUnivPublicas() {
        return EstudantesNasUnivPublicas;
    }

    public void setEstudantesNasUnivPublicas(int EstudantesNasUnivPublicas) {
        this.EstudantesNasUnivPublicas = EstudantesNasUnivPublicas;
    }

    public int getPopDeEstudantes() {
        return PopDeEstudantes;
    }

    public void setPopDeEstudantes(int PopDeEstudantes) {
        this.PopDeEstudantes = PopDeEstudantes;
    }

    public short getEnsinoInfantil() {
        return EnsinoInfantil;
    }

    public void setEnsinoInfantil(short EnsinoInfantil) {
        this.EnsinoInfantil = EnsinoInfantil;
    }

    public int getEstudantesNasUnivPrivadas() {
        return EstudantesNasUnivPrivadas;
    }

    public void setEstudantesNasUnivPrivadas(int EstudantesNasUnivPrivadas) {
        this.EstudantesNasUnivPrivadas = EstudantesNasUnivPrivadas;
    }

    public short getHospitaisPrivados() {
        return HospitaisPrivados;
    }

    public void setHospitaisPrivados(short HospitaisPrivados) {
        this.HospitaisPrivados = HospitaisPrivados;
    }

    public short getHospitaisPublicos() {
        return HospitaisPublicos;
    }

    public void setHospitaisPublicos(short HospitaisPublicos) {
        this.HospitaisPublicos = HospitaisPublicos;
    }

    public short getHospitaisTotais() {
        return HospitaisTotais;
    }

    public void setHospitaisTotais(short HospitaisTotais) {
        this.HospitaisTotais = HospitaisTotais;
    }

    public short getUBSprivadas() {
        return UBSprivadas;
    }

    public void setUBSprivadas(short UBSprivadas) {
        this.UBSprivadas = UBSprivadas;
    }

    public short getUBSpublicas() {
        return UBSpublicas;
    }

    public void setUBSpublicas(short UBSpublicas) {
        this.UBSpublicas = UBSpublicas;
    }

    public short getUBStotais() {
        return UBStotais;
    }

    public void setUBStotais(short UBStotais) {
        this.UBStotais = UBStotais;
    }

    public short getAcademias() {
        return Academias;
    }

    public void setAcademias(short Academias) {
        this.Academias = Academias;
    }

    public short getEnsinoFundamental() {
        return EnsinoFundamental;
    }

    public void setEnsinoFundamental(short EnsinoFundamental) {
        this.EnsinoFundamental = EnsinoFundamental;
    }

    public short getEnsinoMedio() {
        return EnsinoMedio;
    }

    public void setEnsinoMedio(short EnsinoMedio) {
        this.EnsinoMedio = EnsinoMedio;
    }

    public short getGalerias() {
        return Galerias;
    }

    public void setGalerias(short Galerias) {
        this.Galerias = Galerias;
    }

    public short getMuseus() {
        return Museus;
    }

    public void setMuseus(short Museus) {
        this.Museus = Museus;
    }

    public short getUniversidadesPrivadas() {
        return UniversidadesPrivadas;
    }

    public void setUniversidadesPrivadas(short UniversidadesPrivadas) {
        this.UniversidadesPrivadas = UniversidadesPrivadas;
    }

    public short getUniversidadesPublicas() {
        return UniversidadesPublicas;
    }

    public void setUniversidadesPublicas(short UniversidadesPublicas) {
        this.UniversidadesPublicas = UniversidadesPublicas;
    }

    public short getUniversidadesTotais() {
        return UniversidadesTotais;
    }

    public void setUniversidadesTotais(short UniversidadesTotais) {
        this.UniversidadesTotais = UniversidadesTotais;
    }

    public byte getAeroportos() {
        return Aeroportos;
    }

    public void setAeroportos(byte Aeroportos) {
        this.Aeroportos = Aeroportos;
    }

    public byte getClubesDeBasquete() {
        return ClubesDeBasquete;
    }

    public void setClubesDeBasquete(byte ClubesDeBasquete) {
        this.ClubesDeBasquete = ClubesDeBasquete;
    }

    public byte getClubesDeFutebol() {
        return ClubesDeFutebol;
    }

    public void setClubesDeFutebol(byte ClubesDeFutebol) {
        this.ClubesDeFutebol = ClubesDeFutebol;
    }

    public short getDistritos() {
        return Distritos;
    }

    public void setDistritos(short Distritos) {
        this.Distritos = Distritos;
    }

    public byte getEstadios() {
        return Estadios;
    }

    public void setEstadios(byte Estadios) {
        this.Estadios = Estadios;
    }

    public byte getHeliportos() {
        return Heliportos;
    }

    public void setHeliportos(byte Heliportos) {
        this.Heliportos = Heliportos;
    }

    public byte getSubprefeituras() {
        return Subprefeituras;
    }

    public void setSubprefeituras(byte Subprefeituras) {
        this.Subprefeituras = Subprefeituras;
    }
    
    public String tabDados(){
        
        this.setAltitude((short) 670);
        this.setArea(Accessory.Area(this.getPopulacao(), this.getDensidade()));
        this.setClima("Subtropical");
        this.setDia((byte) 31);
        this.setMes("Janeiro");
        this.setAno((short) 1550);
        this.setPIB(Accessory.PIB(this.getPopulacao(), this.getPIBperCapita()));
        
        String Msg = "";
        
        Msg += "<h1>Cidade</h1>";
        Msg += "<table>";
        Msg += "    <th colspan='2'>HISTÓRIA</th>";
        Msg += "    <tr>";
        Msg += "        <th>Fundação</th>";
        Msg+= "         <td>" + this.getDia() + " de " + this.getMes() + " de " + this.getAno() + " (" + (Ano_atual - this.getAno()) + " anos)</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Aniversário</th>";
        Msg+= "         <td>" + this.getDia() + " de " + this.getMes() + "</td>";
        Msg += "    </tr>";
        Msg += "    <th colspan='2'>CARACTERÍSTICAS GEOGRÁFICAS</th>";
        Msg += "    <tr>";
        Msg += "        <th>Área total</th>";
        Msg+= "         <td>" + f.format(this.getArea()) + " km²</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>População total</th>";
        Msg+= "         <td>" + this.getPopulacao() + " hab.</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Densidade</th>";
        Msg+= "         <td>" + this.getDensidade() + " hab./km²</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Clima</th>";
        Msg += "        <td>" + this.getClima() + "</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Altura</th>";
        Msg += "        <td>" + this.getAltitude() + " m</td>";
        Msg += "    </tr>";
        Msg += "    <th colspan='2'>INDICADORES</th>";
        Msg += "    <tr>";
        Msg += "        <th>IDH</th>";
        Msg += "        <td>" + this.getIDH() + "</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>PIB</th>";
        Msg += "        <td>R$ " + f.format(this.getPIB()) + " mil</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>PIB per Capita</th>";
        Msg += "        <td>R$ " + this.getPIBperCapita() + "</td>";
        Msg += "    </tr>";
        Msg += "</table>";
        Msg += "<hr/>";
        
        return Msg;
    }
    
    public String cultura(){
        
        this.setMuseus(Accessory.Museus(this.getPopulacao()));
        this.setGalerias(Accessory.Galerias(this.getMuseus()));
        
        String Msg = "";
        
        Msg += "<h2>Cultura</h2>";
        Msg += "<table>";
        Msg += "    <th colspan='2'>CULTURA</th>";
        Msg += "    <tr>";
        Msg += "        <th>Qntd. de galerias</th>";
        Msg += "        <td>" + this.getGalerias() + " galerias</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Qntd. de museus</th>";
        Msg += "        <td>" + this.getMuseus() + " museus</td>";
        Msg += "    </tr>";
        Msg += "</table>";
        Msg += "<hr/>";
        
        return Msg;
    }
    
    public String educacao(){
        
        this.setEnsinoFundamental(Accessory.EnsinoFundamental(this.getPopulacao()));
        this.setEnsinoMedio(Accessory.EnsinoMedio(this.getPopulacao()));
        this.setEnsinoInfantil(Accessory.EnsinoInfantil(this.getPopulacao()));
        this.setPopDeEstudantes(Accessory.PopDeEstudantes(this.getPopulacao()));
        this.setEstudantesNasUnivPrivadas(Accessory.EstudantesNasPrivadas(this.getPopDeEstudantes()));
        this.setEstudantesNasUnivPublicas(Accessory.EstudantesNasPublicas(this.getPopDeEstudantes()));
        this.setUniversidadesPrivadas(Accessory.UniversidadesPrivadas(this.getEstudantesNasUnivPrivadas()));
        this.setUniversidadesPublicas(Accessory.UniversidadesPublicas(this.getEstudantesNasUnivPublicas()));
        this.setUniversidadesTotais(Accessory.TotalDeUniversidades(this.getUniversidadesPublicas(), this.getUniversidadesPrivadas()));
        
        String Msg = "";
        
        Msg += "<h2>Educação</h2>";
        Msg += "<table>";
        Msg += "    <th colspan='2'>EDUCAÇÃO</th>";
        Msg += "    <tr>";
        Msg += "        <th>Universidades privadas</th>";
        Msg += "        <td>" + this.getUniversidadesPrivadas() + " universidades</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Universidades publicas</th>";
        Msg += "        <td>" + this.getUniversidadesPublicas() + " universidades</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Total de universidades</th>";
        Msg += "        <td>" + this.getUniversidadesTotais() + " universidades</td>";
        Msg += "    </tr>";
        Msg += "    <th colspan='2'>Pop. de estudantes</th>";
        Msg += "    <tr>";
        Msg += "        <th>Estudantes nas Univ. privadas</th>";
        Msg += "        <td>" + this.getEstudantesNasUnivPrivadas() + " estudantes</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Estudantes nas Univ. publicas</th>";
        Msg += "        <td>" + this.getEstudantesNasUnivPublicas() + " estudantes</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Pop. total de estudantes</th>";
        Msg += "        <td>" + this.getPopDeEstudantes() + " estudantes</td>";
        Msg += "    </tr>";
        Msg += "    <th colspan='2'>QNTD. DE ESTABELECIMENTOS DE ENSINO REGULARES</th>";
        Msg += "    <tr>";
        Msg += "        <th>Ensino médio</th>";
        Msg += "        <td>" + this.getEnsinoMedio() + "</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Ensino fundamental</th>";
        Msg += "        <td>" + this.getEnsinoFundamental() + "</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Ensino Infantil</th>";
        Msg += "        <td>" + this.getEnsinoInfantil() + "</td>";
        Msg += "    </tr>";
        Msg += "</table>";
        Msg += "<hr/>";
        
        return Msg;
    }
    
    public String saude(){
        
        this.setHospitaisTotais(Accessory.HopitaisTotais(this.getPopulacao()));
        this.setHospitaisFilantropicos(Accessory.HospitaisFilantropicos(this.getHospitaisTotais()));
        this.setHospitaisPrivados(Accessory.HospitaisPrivados(this.getHospitaisTotais()));
        this.setHospitaisPublicos(Accessory.HospitaisPublicos(this.getHospitaisTotais()));
        this.setUBStotais(Accessory.UBStotais(this.getPopulacao()));
        this.setUBSprivadas(Accessory.UBSprivadas(this.getUBStotais()));
        this.setUBSpublicas(Accessory.UBSpublicas(this.getUBStotais()));
        
        String Msg = "";
        
        Msg += "<h2>Saúde</h2>";
        Msg += "<table>";
        Msg += "    <th colspan='2'>SAÚDE</th>";
        Msg += "    <tr>";
        Msg += "        <th>Nº de UBS publicas</th>";
        Msg += "        <td>" + this.getUBSpublicas() + " unidades</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Nº de UBS privadas</th>";
        Msg += "        <td>" + this.getUBSprivadas() + " unidades</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Nº  total de UBS's</th>";
        Msg += "        <td>" + this.getUBStotais() + " unidades</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Nº de hospitais filantropicos</th>";
        Msg += "        <td>" + this.getHospitaisFilantropicos() + " hospitais</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Nº de hospitais privados</th>";
        Msg += "        <td>" + this.getHospitaisPrivados() + " hospitais</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Nº de hospitais publicos</th>";
        Msg += "        <td>" + this.getHospitaisPublicos() + " hospitais</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Nº total de hospitais</th>";
        Msg += "        <td>" + this.getHospitaisTotais() + " hospitais</td>";
        Msg += "    </tr>";
        Msg += "</table>";
        Msg += "<hr/>";
        
        return Msg;
    }
    
    public String transportes(){
        
        this.setAeroportos((byte) 2);
        this.setArea(Accessory.Area(this.getPopulacao(), this.getDensidade()));
        this.setCiclovias(Accessory.Ciclovias(this.getArea()));
        this.setExtensaoDoMetropolitano(Accessory.Metropolitano(this.getArea()));
        this.setExtensaoDoVLT(Accessory.VLT(this.getArea()));
        this.setEstacoesDoMetro(Accessory.EstacoesDoMetro(this.getExtensaoDoMetropolitano()));
        this.setEstacoesDoVLT(Accessory.EstacoesDoVLT(this.getExtensaoDoVLT()));
        this.setEstradas(Accessory.Estradas(this.getArea()));
        this.setFrotaDeBondes(Accessory.FrotaDeBondes(this.getPopulacao()));
        this.setHeliportos((byte) 49);
        this.setLinhasDoMetro(Accessory.LinhasDoMetro(this.getExtensaoDoMetropolitano()));
        this.setLinhasDoVLT(Accessory.LinhasDoVLT(this.getExtensaoDoVLT()));
        this.setOnibus(Accessory.Onibus(this.getPopulacao()));
        this.setMicroOnibus(Accessory.MicroOnibus(this.getOnibus()));
        this.setOnibusComuns(Accessory.OnibusComuns(this.getOnibus()));
        this.setViasUrbanas(Accessory.ViasUrbanas(this.getArea()));
        this.setTrolebus(Accessory.Trolebus(this.getOnibus()));
        
        String Msg = "";
        
        Msg += "<h2>Transportes</h2>";
        Msg += "<table>";
        Msg += "    <th colspan='2'>TRANSPORTES</th>";
        Msg += "    <tr>";
        Msg += "        <th>Nº de aeroportos</th>";
        Msg += "        <td>" + this.getAeroportos() + "</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Nº de heliportos</th>";
        Msg += "        <td>" + this.getHeliportos() + "</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Extensão das ciclovias</th>";
        Msg += "        <td>" + f.format(this.getCiclovias()) + " km</td>";
        Msg += "    </tr>";
        Msg += "    <th colspan='2'>METROPOLITANO</th>";
        Msg += "    <tr>";
        Msg += "        <th>Extensão do Metropolitano</th>";
        Msg += "        <td>" + f.format(this.getExtensaoDoMetropolitano()) + " km</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Nº de estações do metrô</th>";
        Msg += "        <td>" + this.getEstacoesDoMetro() + " estações</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Nº de linhas do metrô</th>";
        Msg += "        <td>" + this.getLinhasDoMetro() + " linhas</td>";
        Msg += "    </tr>";
        Msg += "    <th colspan='2'>V.L.T.(Bonde)</th>";
        Msg += "    <tr>";
        Msg += "        <th>Extensão do V.L.T.</th>";
        Msg += "        <td>" + f.format(this.getExtensaoDoVLT()) + " km</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Nº de estações do VLT</th>";
        Msg += "        <td>" + this.getEstacoesDoVLT() + " estações</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Nº de linhas do VLT</th>";
        Msg += "        <td>" + this.getLinhasDoVLT() + " linhas</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Frota de bondes</th>";
        Msg += "        <td>" + this.getFrotaDeBondes() + " veículos</td>";
        Msg += "    </tr>";
        Msg += "    <th colspan='2'>VIAS PÚBLICAS</th>";
        Msg += "    <tr>";
        Msg += "        <th>Extensão das estradas</th>";
        Msg += "        <td>" + f.format(this.getEstradas()) + " km</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Extensão das vias urbanas</th>";
        Msg += "        <td>" + f.format(this.getViasUrbanas()) + " km</td>";
        Msg += "    </tr>";
        Msg += "</table>";
        Msg += "<table>";
        Msg += "    <th colspan='2'>ÔNIBUS</th>";
        Msg += "    <tr>";
        Msg += "        <th>Ônibus comuns</th>";
        Msg += "        <td>" + this.getOnibusComuns() + "</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Micro-Ônibus</th>";
        Msg += "        <td>" + this.getMicroOnibus() + "</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Trolebus</th>";
        Msg += "        <td>" + this.getTrolebus() + "</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Frota de Ônibus</th>";
        Msg += "        <td>" + this.getOnibus() + "</td>";
        Msg += "    </tr>";
        Msg += "</table>";
        Msg += "<hr/>";
        
        return Msg;
    }
    
    public String esportes(){
        
        this.setClubesDeBasquete(Accessory.ClubesDeBasquete(this.getPopulacao()));
        this.setClubesDeFutebol(Accessory.ClubesDeFutebol(this.getPopulacao()));
        this.setEstadios(this.getClubesDeFutebol());
        
        String Msg = "";
        
        Msg += "<h2>Esportes</h2>";
        Msg += "<table>";
        Msg += "    <th colspan='2'>ESPORTES</th>";
        Msg += "    <tr>";
        Msg += "        <th>Qntd. de clubes de basquete</th>";
        Msg += "        <td>" + this.getClubesDeBasquete() + " clubes</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Qntd. de clubes de futebol</th>";
        Msg += "        <td>" + this.getClubesDeFutebol() + " clubes</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Qntd. de estádios</th>";
        Msg += "        <td>" + this.getEstadios() + " estádios</td>";
        Msg += "    </tr>";
        Msg += "</table>";
        Msg += "<hr/>";
        
        return Msg;
    }
    
    public String subdivisoes(){
        
        this.setArea(Accessory.Area(this.getPopulacao(), this.getDensidade()));
        this.setDistritos(Accessory.Distritos(this.getArea()));
        this.setSubprefeituras(Accessory.Subprefeituras(this.getDistritos()));
        
        String Msg = "";
        
        Msg += "<h2>Subdivisões</h2>";
        Msg += "<table>";
        Msg += "    <th colspan='2'>SUBDIVISÕES</th>";
        Msg += "    <tr>";
        Msg += "        <th>Distritos</th>";
        Msg += "        <td>" + this.getDistritos() + "</td>";
        Msg += "    </tr>";
        Msg += "    <tr>";
        Msg += "        <th>Subprefeituras</th>";
        Msg += "        <td>" + this.getSubprefeituras() + "</td>";
        Msg += "    </tr>";
        Msg += "</table>";
        
        return Msg;
    }
}

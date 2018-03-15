public enum  skills {
    Attack_Boost_I(1.2),
    Attack_Boost_II(1.4),
    Attack_Boost_III(1.6),
    Attack_Boost_IV(1.8),
    Attack_Boost_V(2);

    private double multiplicador;
    skills(double multiplicador){
        this.multiplicador=multiplicador;
    }


}

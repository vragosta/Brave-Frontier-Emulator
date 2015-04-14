package charactertest;

//RAW LIST OF THE PREMADE CHARACTERS
public class PredefinedCharacter extends Character {

//CHARACTER VARGAS
public void createRagnarok(){
    PredefinedMove move01 = new PredefinedMove();
    PredefinedMove move02 = new PredefinedMove();
    this.setIdentification(1);
    this.setName("Ragnarok");
    this.setType(Type.Fire);
    this.setAbility(getRandomAbility());
    this.setLevel(1);
    this.setMaxLevel(16);
    this.setHealthPool(getRandomHealthPool());
    this.setAttack(getRandomAttack());
    this.setDefense(getRandomDefense());
    this.setSpeed(getRandomSpeed());
    this.setRecovery(getRandomRecovery());
    this.setAccuracy(100);
    this.setEvasion(100);
    this.setEffortPoints(getRandomEffortPoints());
    this.setExperience(0);
    this.setCanEvolve(true);
    this.setNature(getRandomNature());
    this.setFamily("");
    this.setBio("");
    this.setMove01(move01.createEmber());
    this.setMove02(move02.createFlareRide());
    //this.abilityResolution();
    //this.natureResolution();
}

//CHARACTER BURNING VARGAS
public void createBurningRagnarok(){
    PredefinedMove move01 = new PredefinedMove();
    PredefinedMove move02 = new PredefinedMove();
    this.setIdentification(2);
    this.setName("Burning Ragnarok");
    this.setType(Type.Fire);
    this.setAbility(getRandomAbility());
    this.setLevel(16);
    this.setMaxLevel(36);
    this.setHealthPool(getRandomHealthPool());
    this.setAttack(getRandomAttack());
    this.setDefense(getRandomDefense());
    this.setSpeed(getRandomSpeed());
    this.setRecovery(getRandomRecovery());
    this.setAccuracy(100);
    this.setEvasion(100);
    this.setEffortPoints(getRandomEffortPoints());
    this.setExperience(0);
    this.setCanEvolve(true);
    this.setNature(getRandomNature());
    this.setFamily("");
    this.setBio("");
    this.setMove01(move01.createBurningFlame());
    this.setMove02(move02.createExhaustiveFlame());
    this.abilityResolution();
    this.natureResolution();
}

//CHARACTER LANCE
public void createLiandra(){
    PredefinedMove move01 = new PredefinedMove();
    PredefinedMove move02 = new PredefinedMove();
    this.setIdentification(3);
    this.setName("Liandra");
    this.setType(Type.Grass);
    this.setAbility(getRandomAbility());
    this.setLevel(1);
    this.setHealthPool(getRandomHealthPool());
    this.setAttack(getRandomAttack());
    this.setDefense(getRandomDefense());
    this.setSpeed(getRandomSpeed());
    this.setRecovery(getRandomRecovery());
    this.setAccuracy(100);
    this.setEvasion(100);
    this.setEffortPoints(getRandomEffortPoints());
    this.setExperience(0);
    this.setBio("");
    this.setCanEvolve(true);
    this.setNature(getRandomNature());
    this.setFamily("");
    this.setMove01(move01.createVineWhip());
    this.setMove02(move02.createFlashTornado());
    //this.abilityResolution();
    //this.natureResolution();
}

//CHARACTER VINE PIKE LANCE
public void createVinePikeLiandra(){
    PredefinedMove move01 = new PredefinedMove();
    PredefinedMove move02 = new PredefinedMove();
    this.setIdentification(4);
    this.setName("Vine Pike Liandra");
    this.setType(Type.Grass);
    this.setAbility(getRandomAbility());
    this.setLevel(16);
    this.setMaxLevel(36);
    this.setHealthPool(getRandomHealthPool());
    this.setAttack(getRandomAttack());
    this.setDefense(getRandomDefense());
    this.setSpeed(getRandomSpeed());
    this.setRecovery(getRandomRecovery());
    this.setAccuracy(100);
    this.setEvasion(100);
    this.setEffortPoints(getRandomEffortPoints());
    this.setExperience(0);
    this.setBio("");
    this.setCanEvolve(true);
    this.setNature(getRandomNature());
    this.setFamily("");
    this.setMove01(move01.createZephyr());
    this.setMove02(move02.createMystralRage());
    this.abilityResolution();
    this.natureResolution();
}

//CHARACTER RAYDEN
public void createRayden(){
    PredefinedMove move01 = new PredefinedMove();
    PredefinedMove move02 = new PredefinedMove();
    this.setIdentification(5);
    this.setName("Rayden");
    this.setType(Type.Water);
    this.setAbility(getRandomAbility());
    this.setLevel(1);
    this.setMaxLevel(16);
    this.setHealthPool(getRandomHealthPool());
    this.setAttack(getRandomAttack());
    this.setDefense(getRandomDefense());
    this.setSpeed(getRandomSpeed());
    this.setRecovery(getRandomRecovery());
    this.setAccuracy(100);
    this.setEvasion(100);
    this.setEffortPoints(getRandomEffortPoints());
    this.setExperience(0);
    this.setBio("");
    this.setCanEvolve(true);
    this.setNature(getRandomNature());
    this.setFamily("");
    this.setMove01(move01.drillSpear());
    this.setMove02(move02.waterPulse());
    //this.abilityResolution();
    //this.natureResolution();
}

//CHARACTER RAYDEN
public void createSpearFistRayden(){
    PredefinedMove move01 = new PredefinedMove();
    PredefinedMove move02 = new PredefinedMove();
    this.setIdentification(6);
    this.setName("Spear Fist Rayden");
    this.setType(Type.Water);
    this.setAbility(getRandomAbility());
    this.setLevel(16);
    this.setMaxLevel(36);
    this.setHealthPool(getRandomHealthPool());
    this.setAttack(getRandomAttack());
    this.setDefense(getRandomDefense());
    this.setSpeed(getRandomSpeed());
    this.setRecovery(getRandomRecovery());
    this.setAccuracy(100);
    this.setEvasion(100);
    this.setEffortPoints(getRandomEffortPoints());
    this.setExperience(0);
    this.setBio("");
    this.setCanEvolve(true);
    this.setNature(getRandomNature());
    this.setFamily("");
    this.setMove01(move01.spearCross());
    this.setMove02(move02.floodGate());
    this.abilityResolution();
    this.natureResolution();
}

}

/*
//CHARACTER FIRE KING VARGAS
public void createFireKingVargas(){
    CharacterMoveRawList move = new CharacterMoveRawList();
    this.setIdentification(3);
    this.setName("Fire King Vargas");
    this.setType(Type.Fire);
    this.setAbility(getRandomAbility());
    this.setLevel(36);
    this.setMaxLevel(55);
    this.setHealthPool(5);
    this.setAttack(7);
    this.setDefense(5);
    this.setSpeed(7);
    this.setRecovery(8);
    this.setAccuracy(100);
    this.setEvasion(100);
    this.setEffortPoints(2);
    this.setExperience(0);
    this.setCanEvolve(true);
    this.setBio("");
    this.setFamily("");
    this.setMove01(move.fireBlast());
    this.setMove02(move.flamethrower());
    this.abilityResolution();
    this.natureResolution();
}

//CHARACTER FIRE GOD VARGAS
public Character fireGodVargas(){
    CharacterMoveRawList move = new CharacterMoveRawList();
    Character fireGodVargas = new Character();
    fireGodVargas.setIdentification(4);
    fireGodVargas.setName("Vargas");
    fireGodVargas.setType(Type.Fire);
    fireGodVargas.setAbility(getRandomAbility());
    fireGodVargas.setLevel(55);
    fireGodVargas.setMaxLevel(68);
    fireGodVargas.setHealthPool(5);
    fireGodVargas.setAttack(7);
    fireGodVargas.setDefense(5);
    fireGodVargas.setSpeed(7);
    fireGodVargas.setAccuracy(100);
    fireGodVargas.setEvasion(100);
    fireGodVargas.setEffortPoints(2);
    fireGodVargas.setExperience(0);
    fireGodVargas.setCanEvolve(true);
    fireGodVargas.setBio("");
    fireGodVargas.setMove01(move.felFlame());
    fireGodVargas.setMove02(move.flamethrower());
    fireGodVargas.abilityResolution();
        return fireGodVargas;
}

//CHARACTER HOLY FLAME VARGAS
public Character holyFlameVargas(){
    CharacterMoveRawList move = new CharacterMoveRawList();
    Character holyFlameVargas = new Character();
    holyFlameVargas.setIdentification(5);
    holyFlameVargas.setName("Vargas");
    holyFlameVargas.setType(Type.Fire);
    holyFlameVargas.setAbility(getRandomAbility());
    holyFlameVargas.setLevel(68);
    holyFlameVargas.setMaxLevel(100);
    holyFlameVargas.setHealthPool(5);
    holyFlameVargas.setAttack(7);
    holyFlameVargas.setDefense(5);
    holyFlameVargas.setSpeed(7);
    holyFlameVargas.setAccuracy(100);
    holyFlameVargas.setEvasion(100);
    holyFlameVargas.setEffortPoints(2);
    holyFlameVargas.setExperience(0);
    holyFlameVargas.setCanEvolve(false);
    holyFlameVargas.setBio("");
    holyFlameVargas.setMove01(move.felFlame());
    holyFlameVargas.setMove02(move.flamethrower());
    holyFlameVargas.abilityResolution();
        return holyFlameVargas;
}

//CHARACTER UDA
public Character uda(){
    CharacterMoveRawList move = new CharacterMoveRawList();
    Character uda = new Character();
    uda.setIdentification(004);
    uda.setName("Uda");
    uda.setType(Type.Electric);
    uda.setAbility(getRandomAbility());
    uda.setLevel(005);
    uda.setHealthPool(13);
    uda.setAttack(12);
    uda.setDefense(9);
    uda.setSpeed(12);
    uda.setAccuracy(100);
    uda.setEvasion(100);
    uda.setEffortPoints(2);
    uda.setExperience(0);
    uda.setBio("");
    uda.setMove01(move.thunderShock());
    uda.setMove02(move.thunderbolt());
    uda.abilityResolution();
        return uda;
}

//CHARACTER ARCHANGEL
public Character archangel(){
    CharacterMoveRawList move = new CharacterMoveRawList();
    Character archangel = new Character();
    archangel.setIdentification(005);
    archangel.setName("Archangel");
    archangel.setType(Type.Light);
    archangel.setAbility(getRandomAbility());
    archangel.setLevel(005);
    archangel.setHealthPool(17);
    archangel.setAttack(11);
    archangel.setDefense(11);
    archangel.setSpeed(9);
    archangel.setAccuracy(100);
    archangel.setEvasion(100);
    archangel.setEffortPoints(3);
    archangel.setExperience(0);
    archangel.setBio("");
    archangel.setMove01(move.radiance());
    archangel.setMove02(move.unforgivingLight());
    archangel.abilityResolution();
        return archangel;
}

//CHARACTER SIBYL
public Character sibyl(){
    CharacterMoveRawList move = new CharacterMoveRawList();
    Character sibyl = new Character();
    sibyl.setIdentification(006);
    sibyl.setName("Sibyl");
    sibyl.setType(Type.Dark);
    sibyl.setAbility(getRandomAbility());
    sibyl.setLevel(005);
    sibyl.setHealthPool(13);
    sibyl.setAttack(12);
    sibyl.setDefense(9);
    sibyl.setSpeed(12);
    sibyl.setAccuracy(100);
    sibyl.setEvasion(100);
    sibyl.setEffortPoints(2);
    sibyl.setExperience(0);
    sibyl.setBio("");
    sibyl.setMove01(move.nightShade());
    sibyl.setMove02(move.darkPulse());
    sibyl.abilityResolution();
        return sibyl;
}
*/

package charactertest;

//RAW LIST OF THE PREMADE CHARACTER MOVES
public class PredefinedMove extends CharacterMove{

//RAGNAROK SPECIFIC REGULAR FIRE ATTACK
public CharacterMove createEmber(){
    this.setName("Ember");
    this.setBio("Ragnarok Regular Fire Attack");
    this.setType(Type.Fire);
    this.setBase(40);
    this.setAccuracy(100);
        return this;
}
       
//RAGNAROK SPECIAL FIRE ATTACK
public CharacterMove createFlareRide(){
    this.setName("Flare Ride");
    this.setBio("Ragnarok Special Fire Attack");
    this.setType(Type.Fire);
    this.setBase(60);
    this.setAccuracy(90);
        return this;
}

//BURNINING RAGNAROK REGULAR FIRE ATTACK
public CharacterMove createBurningFlame(){
    this.setName("Burning Flame");
    this.setBio("Burning Ragnarok Regular Fire Attack");
    this.setType(Type.Fire);
    this.setBase(60);
    this.setAccuracy(100);
        return this;
}

//BURNINING RAGNAROK SPECIAL FIRE ATTACK
public CharacterMove createExhaustiveFlame(){
    this.setName("Exhaustive Flame");
    this.setBio("Burning Ragnarok Special Fire Attack");
    this.setType(Type.Fire);
    this.setBase(80);
    this.setAccuracy(90);
        return this;
}

//LIANDRA REGULAR GRASS ATTACK
public CharacterMove createVineWhip(){
    this.setName("Vine Whip");
    this.setBio("Liandra Regular Grass Attack");
    this.setType(Type.Grass);
    this.setBase(40);
    this.setAccuracy(100);
        return this;
}

//LIANDRA SPECIAL GRASS ATTACK
public CharacterMove createFlashTornado(){
    this.setName("Flash Tornado");
    this.setBio("Liandra Special Grass Attack");
    this.setType(Type.Grass);
    this.setBase(60);
    this.setAccuracy(90);
        return this;
}

//VINE PIKE LIANDRA REGULAR GRASS ATTACK
public CharacterMove createZephyr(){
    this.setName("Zephyr");
    this.setBio("Vine Pike Liandra Regular Grass Attack");
    this.setType(Type.Grass);
    this.setBase(60);
    this.setAccuracy(100);
        return this;
}

public CharacterMove createMystralRage(){
    this.setName("Mystral Rage");
    this.setBio("Vine Pike Liandra Special Grass Attack");
    this.setType(Type.Grass);
    this.setBase(80);
    this.setAccuracy(90);
        return this;
}


//RAYDEN REGULAR WATER ATTACK
public CharacterMove drillSpear(){
    this.setName("Drill Spear");
    this.setBio("Rayden Regular Water Attack");
    this.setType(Type.Water);
    this.setBase(40);
    this.setAccuracy(100);
        return this;
}

//RAYDEN SPECIAL WATER ATTACK
public CharacterMove waterPulse(){
    this.setName("Water Pulse");
    this.setBio("Rayden Special Water Attack");
    this.setType(Type.Water);
    this.setBase(60);
    this.setAccuracy(90);
        return this;
}

//SPEAR FIST RAYDEN REGULAR WATER ATTACK
public CharacterMove spearCross(){
    this.setName("Spear Cross");
    this.setBio("Spear Fist Rayden Regular Water Attack");
    this.setType(Type.Water);
    this.setBase(60);
    this.setAccuracy(75);
        return this;
}

//SPEAR FIST RAYDEN SPECIAL WATER ATTACK
public CharacterMove floodGate(){
    this.setName("Flood Gate");
    this.setBio("Spear Fist Rayden Special Water Attack");
    this.setType(Type.Water);
    this.setBase(80);
    this.setAccuracy(90);
        return this;
}

}

/*
public CharacterMove infinityFlare(){
    CharacterMove infinityFlare = new CharacterMove();
    infinityFlare.setName("Flare Ride");
    infinityFlare.setBio("Vargas Attack");
    infinityFlare.setType(Type.Fire);
    infinityFlare.setBase(60);
    infinityFlare.setAccuracy(100);
        return infinityFlare;
}

public CharacterMove flamethrower(){
    CharacterMove flamethrower = new CharacterMove();   
    flamethrower.setName("Flamethrower");
    flamethrower.setBio("Moderate Fire Attack");
    flamethrower.setType(Type.Fire);
    flamethrower.setBase(75);
    flamethrower.setAccuracy(85);
        return flamethrower;
}

public CharacterMove fireBlast(){
    CharacterMove fireBlast = new CharacterMove();    
    fireBlast.setName("Fire Blast");
    fireBlast.setBio("Powerful Fire Attack");
    fireBlast.setType(Type.Fire);
    fireBlast.setBase(100);
    fireBlast.setAccuracy(75);
        return fireBlast;
}

public CharacterMove felFlame(){
    CharacterMove felFlame = new CharacterMove();
    felFlame.setName("Fel Flame");
    felFlame.setBio("Very Powerful Fire Attack");
    felFlame.setType(Type.Fire);
    felFlame.setBase(120);
    felFlame.setAccuracy(100);
        return felFlame;
}

public CharacterMove thunderShock(){
    CharacterMove thunderShock = new CharacterMove();
    thunderShock.setName("Thunder Shock");
    thunderShock.setBio("Weak Electric Attack");
    thunderShock.setType(Type.Electric);
    thunderShock.setBase(40);
    thunderShock.setAccuracy(100);
        return thunderShock;
}

public CharacterMove thunderbolt(){
    CharacterMove thunderBolt = new CharacterMove();
    thunderBolt.setName("Thunder Bolt");
    thunderBolt.setBio("Moderate Electric Attack");
    thunderBolt.setType(Type.Electric);
    thunderBolt.setBase(75);
    thunderBolt.setAccuracy(85);
        return thunderBolt;
}

public CharacterMove thunder(){
    CharacterMove thunder = new CharacterMove();
    thunder.setName("Thunder");
    thunder.setBio("Powerful Electric Attack");
    thunder.setBase(100);
    thunder.setAccuracy(75);
        return thunder;
}

public CharacterMove radiance(){
    CharacterMove radiance = new CharacterMove();
    radiance.setName("Radiance");
    radiance.setBio("Weak Light Attack");
    radiance.setType(Type.Light);
    radiance.setBase(40);
    radiance.setAccuracy(100);
        return radiance;
}

public CharacterMove unforgivingLight(){
    CharacterMove unforgivingLight = new CharacterMove();
    unforgivingLight.setName("Unforgiving Light");
    unforgivingLight.setBio("Moderate Light Attack");
    unforgivingLight.setType(Type.Light);
    unforgivingLight.setBase(75);
    unforgivingLight.setAccuracy(85);
        return unforgivingLight;
}

public CharacterMove holyBeam(){
    CharacterMove holyBeam = new CharacterMove();
    holyBeam.setName("Holy Beam");
    holyBeam.setBio("Powerful Light Attack");
    holyBeam.setType(Type.Light);
    holyBeam.setBase(100);
    holyBeam.setAccuracy(75);
        return holyBeam;
}

public CharacterMove nightShade(){
    CharacterMove nightShade = new CharacterMove();
    nightShade.setName("Night Shade");
    nightShade.setBio("Weak Dark Attack");
    nightShade.setType(Type.Dark);
    nightShade.setBase(40);
    nightShade.setAccuracy(100);
        return nightShade;
}

public CharacterMove darkPulse(){
    CharacterMove darkPulse = new CharacterMove();
    darkPulse.setName("Dark Pulse");
    darkPulse.setBio("Moderate Dark Attack");
    darkPulse.setType(Type.Dark);
    darkPulse.setBase(75);
    darkPulse.setAccuracy(85);
        return darkPulse;
}

public CharacterMove malevolence(){
    CharacterMove malevolence = new CharacterMove();
    malevolence.setName("Malevolence");
    malevolence.setBio("Powerful Dark Attack");
    malevolence.setType(Type.Dark);
    malevolence.setBase(100);
    malevolence.setAccuracy(75);
        return malevolence;
}
*/
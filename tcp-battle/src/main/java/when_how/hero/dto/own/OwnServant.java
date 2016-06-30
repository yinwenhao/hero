package when_how.hero.dto.own;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import when_how.hero.battle.data.Servant;
import when_how.hero.sdata.cache.SCardCache;
import when_how.hero.sdata.domain.SCard;

@JsonInclude(Include.NON_NULL)
public class OwnServant extends OwnEntity {

	private boolean summoningSickness; // 是否召唤失调

	private int attNum; // 本回合已经攻击的次数

	private int attNumLimit; // 本回合攻击次数上限

	private int[] aureoleEffect; // 光环

	private int[] battlecryEffect; // 战吼

	private int[] deathrattleEffect; // 亡语

	private int[] inspireEffect; // 激励

	public OwnServant(Servant servant) {
		super(servant);
		this.summoningSickness = servant.isSummoningSickness();
		this.attNum = servant.getAttNum();
		this.attNumLimit = servant.getAttNumLimit();

		SCard sCard = SCardCache.CACHE.get(servant.getSid());
		this.aureoleEffect = sCard.getAureoleEffect();
		this.battlecryEffect = sCard.getBattlecryEffect();
		this.deathrattleEffect = sCard.getDeathrattleEffect();
		this.inspireEffect = sCard.getInspireEffect();
	}

	public int[] getAureoleEffect() {
		return aureoleEffect;
	}

	public void setAureoleEffect(int[] aureoleEffect) {
		this.aureoleEffect = aureoleEffect;
	}

	public int[] getBattlecryEffect() {
		return battlecryEffect;
	}

	public void setBattlecryEffect(int[] battlecryEffect) {
		this.battlecryEffect = battlecryEffect;
	}

	public int[] getDeathrattleEffect() {
		return deathrattleEffect;
	}

	public void setDeathrattleEffect(int[] deathrattleEffect) {
		this.deathrattleEffect = deathrattleEffect;
	}

	public int[] getInspireEffect() {
		return inspireEffect;
	}

	public void setInspireEffect(int[] inspireEffect) {
		this.inspireEffect = inspireEffect;
	}

	public boolean isSummoningSickness() {
		return summoningSickness;
	}

	public void setSummoningSickness(boolean summoningSickness) {
		this.summoningSickness = summoningSickness;
	}

	public int getAttNum() {
		return attNum;
	}

	public void setAttNum(int attNum) {
		this.attNum = attNum;
	}

	public int getAttNumLimit() {
		return attNumLimit;
	}

	public void setAttNumLimit(int attNumLimit) {
		this.attNumLimit = attNumLimit;
	}

}

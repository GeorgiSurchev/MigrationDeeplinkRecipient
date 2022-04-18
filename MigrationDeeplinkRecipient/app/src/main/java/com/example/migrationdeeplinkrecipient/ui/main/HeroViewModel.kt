package com.example.migrationdeeplinkrecipient.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.migrationdeeplinkrecipient.ui.main.model.MigrationData

class HeroViewModel : ViewModel() {

	val characterName = MutableLiveData<String>()
	val heroIcon = MutableLiveData<String>()
	val strength = MutableLiveData<String>()
	val dexterity = MutableLiveData<String>()
	val life = MutableLiveData<String>()
	val race = MutableLiveData<String>()

	fun setHeroData(migrationData: MigrationData) {
		with(migrationData) {
			this@HeroViewModel.characterName.value = characterName
			this@HeroViewModel.race.value = race
			this@HeroViewModel.strength.value = strength
			this@HeroViewModel.dexterity.value = dexterity
			this@HeroViewModel.life.value = life
			this@HeroViewModel.heroIcon.value = avatarIcon
		}
	}
}

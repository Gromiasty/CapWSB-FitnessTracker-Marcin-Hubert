package com.capgemini.wsb.fitnesstracker.training.api;

import com.capgemini.wsb.fitnesstracker.training.internal.TrainingUpdate;

public interface TrainingService {

    Training createTraining(TrainingUpdate training);

    Training updateTraining(Long id, TrainingUpdate training);
}

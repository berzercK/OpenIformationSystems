package nntu.ois.labs.application;

import mpi.MPI;

public class TestMPJ {
    public static void main(String[] args) {
        MPI.Init(args);

        int size = MPI.COMM_WORLD.Size();
        int currentRank = MPI.COMM_WORLD.Rank();

        System.out.println("Hello world in <" + currentRank + "> from " + size);

        MPI.Finalize();
    }
}

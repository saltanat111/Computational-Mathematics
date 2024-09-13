program mach_eps
    implicit none

    real :: eps32
    integer :: n32
    double precision :: eps64
    integer :: n64
    integer :: i

    eps32 = 1.0
    n32 = 0

    do while (1.0 + eps32 > 1.0)
        eps32 = eps32 / 2.0
        n32 = n32 + 1
    end do

    eps64 = 1.0d0
    n64 = 0

    do while (1.0d0 + eps64 > 1.0d0)
        eps64 = eps64 / 2.0d0
        n64 = n64 + 1
    end do

    print *, "Machine epsilon + 1 for 32 bit system: ", eps32 * 2.0 + 1.0
    print *, "Machine epsilon + 1 for 64 bit system: ", eps64 * 2.0d0 + 1.0d0
    print *, ""
    print *, "Machine epsilon for 32 bit system: ", eps32 * 2.0
    print *, "Machine epsilon for 64 bit system: ", eps64 * 2.0d0
    print *, ""
    print *, "Machine epsilon divided by 2 and added 1 for 32 bit system: ", eps32 + 1.0
    print *, "Machine epsilon divided by 2 and added 1 for 64 bit system: ", eps64 + 1.0d0
    print *, ""
    print *, "Number of iterations needed to find Machine epsilon for 32 bit system: ", n32
    print *, "Number of iterations needed to find Machine epsilon for 64 bit system: ", n64
    print *, ""
    print *, "Conclusion: "
    print *, "Machine epsilon for 32 bit system is 2^-23 (because it took 24 iterations)"
    print *, "Machine epsilon for 64 bit system is 2^-52 (because it took 53 iterations)"

end program mach_eps

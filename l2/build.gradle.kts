plugins {
    `cpp-library`
    `cpp-unit-test`
}

library {
    targetMachines.add(machines.linux.x86_64)
    targetMachines.add(machines.windows.x86_64)
    linkage.set(listOf(Linkage.STATIC))
}

buildPipelineView('project-B') {
    filterBuildQueue()
    filterExecutors()
    title('Project A CI Pipeline')
    displayedBuilds(5)
    selectedJob('JobDSL')
    alwaysAllowManualTrigger()
    showPipelineParameters()
    refreshFrequency(60)
}

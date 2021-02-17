# AssignedSection Schema

```txt
engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items
```

Section with one class units (or on call hours) assigned.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                     |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghcOutput.schema.json\*](../out/ghcOutput.schema.json "open original schema") |

## items Type

`object` ([AssignedSection](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection.md))

# AssignedSection Properties

| Property                              | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                                  |
| :------------------------------------ | --------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [refFrame](#refframe)                 | `string`  | Required | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-refframe.md "engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/refFrame")                 |
| [day](#day)                           | `integer` | Required | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-day.md "engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/day")                           |
| [realIndex](#realindex)               | `integer` | Required | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-realindex.md "engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/realIndex")               |
| [fictionalIndex](#fictionalindex)     | `integer` | Required | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-fictionalindex.md "engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/fictionalIndex")     |
| [sessionsAssigned](#sessionsassigned) | `array`   | Required | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned.md "engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned") |

## refFrame

Frame timetable section with assignment.


`refFrame`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-refframe.md "engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/refFrame")

### refFrame Type

`string`

## day

Day of the week when the section is located.


`day`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-day.md "engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/day")

### day Type

`integer`

## realIndex

Position on the day, of the real section, in the frame.


`realIndex`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-realindex.md "engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/realIndex")

### realIndex Type

`integer`

## fictionalIndex

Position on the day, of the fictional section, in the frame.


> The engine make the fictional sections, as a division of Real Sections.
>

`fictionalIndex`

-   is required
-   Type: `integer`
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-fictionalindex.md "engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/fictionalIndex")

### fictionalIndex Type

`integer`

## sessionsAssigned

List of class units and on call hours assigned in the section.


`sessionsAssigned`

-   is required
-   Type: `object[]` ([SessionAssigned](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned.md))
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned.md "engineOutputGHCSchema#/properties/timetable/properties/assignedSections/items/properties/sessionsAssigned")

### sessionsAssigned Type

`object[]` ([SessionAssigned](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection-properties-sessionsassigned-sessionassigned.md))
